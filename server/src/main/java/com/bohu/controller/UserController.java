package com.bohu.controller;


import com.bohu.config.MyPermission;
import com.bohu.entity.PageResult;
import com.bohu.entity.Result;
import com.bohu.pojo.User;
import com.bohu.pojo.vo.UserVO;
import com.bohu.service.UserService;
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


    @PostMapping("/login")
    public Result login(@RequestBody UserVO userVO, HttpServletResponse response) {
        return userService.userLogn(userVO, response);

    }


    /***
     * @Description:
     * @Author: shenbohu
     * @Date: 2021/5/19 3:43 下午
     * @Param: [pageNum, pageSize]
     * @return:
     **/
    @MyPermission
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
    @MyPermission(username = "admin")
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


    @MyPermission
    @GetMapping(value = "getallusers")
    public Result getallusers() {
        return userService.getallusers();
    }

}
