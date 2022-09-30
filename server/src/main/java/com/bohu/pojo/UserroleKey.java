package com.bohu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * userrole
 * @author 
 */
@Data
public class UserroleKey implements Serializable {
    /**
     * 角色id
     */
    private String roleid;

    /**
     * 用户id
     */
    private String username;

    private static final long serialVersionUID = 1L;
}