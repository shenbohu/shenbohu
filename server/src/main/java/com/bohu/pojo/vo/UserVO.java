package com.bohu.pojo.vo;


import com.bohu.pojo.Role;
import com.bohu.pojo.User;
import lombok.Data;


import java.util.List;

/**
 * @ClassName UserVO
 * @Author shenbohu
 * @Date 2021/6/139:48 下午
 * @Version 1.0
 **/
@Data
public class UserVO extends User{

    private String username;//用户名

    private String password;//密码，加密存储

    private String code;

   // private SaSession session;

    private String tokenValueByLoginId;  //token令牌值

    private List<Role> roles; //用户的角色

    private List<RightVO> rightVOS; //用户的权限

    private String  Authorization; //用户的token

    private List<String> rolesid; //用户的角色

}
