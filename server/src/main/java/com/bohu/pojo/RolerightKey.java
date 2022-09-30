package com.bohu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * roleright
 * @author 
 */
@Data
public class RolerightKey implements Serializable {
    /**
     * 角色id
     */
    private String roleid;

    /**
     * 权限id
     */
    private String rightid;

    private static final long serialVersionUID = 1L;
}