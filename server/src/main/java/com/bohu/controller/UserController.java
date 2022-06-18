package com.bohu.controller;


import com.bohu.entity.PageResult;
import com.bohu.entity.Result;
import com.bohu.pojo.User;
import com.bohu.service.UserService;
import com.bohu.vo.UserVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping(value = "/user")
@RefreshScope
public class UserController {


    @Value("${server.port}")
    public String port;


    @Resource
    private UserService userService;

//    @Resource
//    private UserDetailsService userDetailsService;

    @PostMapping("/login")
    public Result login(@RequestBody UserVO userVO, HttpServletResponse response) {
        return userService.userLogn(userVO, response);

    }

//    @GetMapping("/logins")
//    public UserDetails logins() {
//        return userDetailsService.loadUserByUsername("s");
//
//    }


    /***
     * @Description:
     * @Author: shenbohu
     * @Date: 2021/5/19 3:43 下午
     * @Param: [pageNum, pageSize]
     * @return:
     **/

    @GetMapping(value = "users/{pageNum}/{pageSize}")
    public PageResult findAll(@PathVariable("pageNum") String pageNum, @PathVariable("pageSize") String pageSize) {
        return userService.findAll(pageNum, pageSize);
    }

    /***
     * @Description:
     * @Author: shenbohu
     * @Date: 2021/5/19 5:49 下午
     * @Param: [id]
     * @return:
     **/
    @GetMapping(value = "userbyid/{id}")
    public Result getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }


    /***
     * @Description:
     * @Author: shenbohu
     * @Date: 2021/6/13 9:09 下午
     * @Param: [user]
     * @return: 用户注册
     **/
    @PostMapping(value = "createUser")
    Result createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    /***
     * @Description:
     * @Author: shenbohu
     * @Date: 2021/6/13 9:55 下午
     * @Param: [userVO]
     * @return: 激活用户的账号
     **/
    @PutMapping(value = "updateUser")
    Result updateUser(@RequestBody UserVO userVO) {
        return userService.updateUser(userVO);
    }

    /***
     * @Description:
     * @Author: shenbohu
     * @Date: 2021/6/13 10:05 下午
     * @Param: [code] 给用户发送验证码
     * @return:
     **/
    @GetMapping(value = "getcode/{type}/{phone}")
    Result getcode(@PathVariable String type, @PathVariable String phone) {
        return userService.getcode(type, phone);
    }


    @GetMapping("/publicKey")
    public String getPublicKey() {
        return port;
    }

}
