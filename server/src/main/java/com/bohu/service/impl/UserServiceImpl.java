package com.bohu.service.impl;


import com.bohu.dao.Appstore.RightMapper;
import com.bohu.dao.Appstore.RoleMapper;
import com.bohu.dao.Appstore.UserMapper;
import com.bohu.dao.Business.CorditsMapper;
import com.bohu.dao.Sharding.CourseMapper;
import com.bohu.entity.PageResult;
import com.bohu.entity.Result;
import com.bohu.entity.StatusCode;
import com.bohu.entity.YmlConfig;
import com.bohu.feign.corditsfeign;
import com.bohu.pojo.Cordits;
import com.bohu.pojo.Course;
import com.bohu.pojo.Role;
import com.bohu.pojo.User;
import com.bohu.pojo.vo.RightVO;
import com.bohu.pojo.vo.UserVO;
import com.bohu.service.UserService;
import com.bohu.utils.JwtUtil;
import com.bohu.utils.MD5Utils;
import com.bohu.utils.SMSUtils;
import com.bohu.utils.ValidateCodeUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.concurrent.TimeUnit;


/**
 * @ClassName UserServiceImpl
 * @Author shenbohu
 * @Date 2021/5/1910:20 上午
 * @Version 1.0
 **/
@Service
//@Configuration
@Transactional(transactionManager = "appstoreTransactionManager")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private RightMapper rightMapper;

    @Autowired
    private YmlConfig ymlConfig;

    @Autowired
    private corditsfeign corditsfeign;

    @Resource
    private CorditsMapper corditsMapper;


    @Autowired
    private CourseMapper courseMapper;

    @Override
    public PageResult findAll(String pageNum, String pageSize) {
        Page page = PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        List<User> userList = userMapper.selectall();
        return PageResult.ok(page.getTotal(), userList);
    }

    @Override
    public Result getUserById(String id) {
        User user = userMapper.selectByPrimaryKey(id);
        return Result.ok(user);
    }

    @Override
    //@GlobalTransactional
    public Result createUser(User user) {
        try {
            if (StringUtils.isEmpty(user.getPassword())) {
                return new Result(false, StatusCode.ERROR, "");
            }
            //user.setPassword(SaSecureUtil.md5(user.getPassword()));
            user.setCreated(new Date());
            user.setStatus("0");
//           userMapper.insertSelective(user);
            Cordits cordits = new Cordits();
            cordits.setUserid(user.getUsername());
            cordits.setNum("30");
            cordits.setId(UUID.randomUUID().toString());
            //corditsfeign.createcrodits(cordits);
            corditsMapper.insert(cordits);


            for (int i = 0; i < 100; i++) {
                Course course = new Course();
                //cid由我们设置的策略，雪花算法进行生成
                //分库根据user_id
//                course.setCid(10l);
                course.setUserId(100L);
                course.setCname("库1");
                course.setCtime(new Date());
                course.setStatus("1");
                courseMapper.insert(course);
                //分库根据user_id
//                course.setCid(10l);
                course.setUserId(200L);
                course.setStatus("库1");
                course.setCtime(new Date());
                course.setStatus("2");
                courseMapper.insert(course);

                course.setCname("库2");
                course.setUserId(117L);
                course.setCtime(new Date());
                course.setStatus("1");
                courseMapper.insert(course);

                course.setCname("库2");
                course.setUserId(113L);
                course.setCtime(new Date());
                course.setStatus("2");
                courseMapper.insert(course);

            }

        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return new Result(true, StatusCode.OK, user);
    }

    @Override
    public Result updateUser(UserVO userVO) {
        if (StringUtils.isEmpty(userVO.getCode())) {
            return new Result(false, StatusCode.ERROR, "请输入验证码");
        }
        try {
            String o = (String) redisTemplate.opsForValue().get(userVO.getUsername() + "code");
            if (Objects.equals(o, userVO.getCode())) {
                userVO.setStatus("1");
            }
            userMapper.updateByPrimaryKey(userVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(true, StatusCode.OK, "cg");
    }

    @Override
    public Result getcode(String type, String phone) {
        if (StringUtils.isEmpty(type) || StringUtils.isEmpty(phone)) {
            return new Result(false, StatusCode.ERROR, "参数不全");
        }
        Integer integer = ValidateCodeUtils.generateValidateCode(6);
        try {
            if (Objects.equals("JH", type)) {
                boolean b = SMSUtils.sendShortMessage(ymlConfig.getSmsutils()
                                .get("templateCode.validate_codez"),
                        phone, integer.toString()
                        , ymlConfig.getSmsutils().get("SignName")
                );
                if (b) {
                    redisTemplate.opsForValue().set(phone + "JH", integer.toString(), 5, TimeUnit.MINUTES);
                } else {
                    return new Result(false, StatusCode.ERROR, "发送失败");
                }

            } else if (Objects.equals("DL", type)) {
                redisTemplate.opsForValue().set(phone + "DL", integer.toString(), 5, TimeUnit.MINUTES);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return Result.ok(integer);
    }

    @Override
    public Result userLogn(UserVO user, HttpServletResponse response) {
        //校验参数
        if (org.apache.commons.lang.StringUtils.isEmpty(user.getUsername())) {
            throw new RuntimeException("请输入用户名");
        }
        if (org.apache.commons.lang.StringUtils.isEmpty(user.getPassword())) {
            throw new RuntimeException("请输入密码");
        }
        String password = user.getPassword();
        String username = user.getUsername();
        password = MD5Utils.md5(password);
        UserVO userVO = userMapper.selectByUsernameAdnPassword(username, password);
        if (userVO == null) {
            return new Result(false, StatusCode.ERROR, "账号或密码错误");
        }
        Map<String, Object> tokenInfo = new HashMap<>();
        tokenInfo.put("name", userVO.getName());
        tokenInfo.put("username", username);
        String jwt = JwtUtil.createJWT(UUID.randomUUID().toString(), tokenInfo.toString(), null);
        userVO.setAuthorization(jwt);
        Cookie cookie = new Cookie("Authorization", jwt);
        cookie.setDomain("localhost");
        cookie.setPath("/");
        response.addCookie(cookie);


        List<Role> roles = roleMapper.selectByUserRole(username);
        List<RightVO> rightVOS = new ArrayList<>();
        userVO.setRoles(roles);
        if (roles.size() != 0) {
            List<String> roleids = new ArrayList<>();
            for (Role role : roles) {
                roleids.add(role.getRoleid());
            }
            rightVOS = rightMapper.selectByIds(roleids);
            userVO.setRightVOS(rightVOS);
        }
        userVO.setTokenValueByLoginId("");
        ;
        //存储
        if (roles.size() != 0) {
            redisTemplate.opsForList().rightPushAll(username + "role", roles);
        } else {
            redisTemplate.opsForList().rightPushAll(username + "rolenull", "111");
        }
        if (rightVOS.size() != 0) {
            redisTemplate.opsForList().rightPushAll(username + "right", rightVOS);
        } else {
            redisTemplate.opsForList().rightPushAll(username + "rightnull", "22");
        }
        return new Result(true, StatusCode.OK, userVO);
    }


    @Override
    public Result getallusers() {
        return Result.ok(userMapper.selectall());
    }
}
