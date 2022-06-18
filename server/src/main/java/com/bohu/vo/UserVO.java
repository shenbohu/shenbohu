package com.bohu.vo;

//import cn.dev33.satoken.session.SaSession;
//import cn.dev33.satoken.stp.SaTokenInfo;
import com.bohu.pojo.Role;
import com.bohu.pojo.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @ClassName UserVO
 * @Author shenbohu
 * @Date 2021/6/139:48 下午
 * @Version 1.0
 **/
@Data
public class UserVO extends User implements UserDetails {

    private String username;//用户名
    private String password;//密码，加密存储

    private String code;

   // private SaSession session;

    private String tokenValueByLoginId;  //token令牌值

    private List<Role> roles; //用户的角色

    private List<RightVO> rightVOS; //用户的权限

    private String  Authorization; //用户的token

    private List<String> rolesid; //用户的角色

    private Collection<? extends GrantedAuthority> authorities;

    public UserVO() {

    }

    public UserVO(String username, String password, Collection<? extends GrantedAuthority> authorities,
                      List<Role> roleMenus) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.roles = roleMenus;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
