package com.bohu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * t_user0
 * @author 
 */
@Data
public class TUser implements Serializable {
    /**
     * 主键
     */
    private Long userId;

    /**
     * 姓名
     */
    private String name;

    private static final long serialVersionUID = 1L;
}