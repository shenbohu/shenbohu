package com.bohu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * order
 * @author 
 */
@Data
public class Order implements Serializable {
    private String oid;

    private String type;

    private static final long serialVersionUID = 1L;
}