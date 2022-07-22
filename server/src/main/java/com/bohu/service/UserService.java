package com.bohu.service;

import com.bohu.pojo.User;
import com.bohu.entity.PageResult;
import com.bohu.entity.Result;
import com.bohu.pojo.vo.UserVO;

import javax.servlet.http.HttpServletResponse;

public interface UserService {


    PageResult findAll(String pageNum, String pageSize);

    Result getUserById(String id);

    Result createUser(User user);

    Result updateUser(UserVO userVO);

    Result getcode(String type, String phone);

    Result userLogn(UserVO userVO, HttpServletResponse response);


    Result getallusers();

}
