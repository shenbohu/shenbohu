package com.bohu.pojo;

import lombok.Data;

import java.util.LinkedHashMap;

/**
 * @ClassName Health
 * @Author shenbohu
 * @Date 2022/6/816:11
 * @Version 1.0
 **/
@Data
public class Health {

    private LinkedHashMap data;

    private String errcode;

    private String errmsg;
}
