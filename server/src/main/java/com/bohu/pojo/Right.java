package com.bohu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * right
 * @author 
 */
@Data
public class Right implements Serializable {
    /**
     * 权限id
     */
    private String rightid;

    private Date cdate;

    private Date udate;

    /**
     * 创建人
     */
    private String founder;

    /**
     * 描述
     */
    private String description;

    /**
     * 名称
     */
    private String name;

    private static final long serialVersionUID = 1L;
}