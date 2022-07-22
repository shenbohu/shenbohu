package com.bohu.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName PageResult
 * @Author shenbohu
 * @Date 2021/5/193:22 下午
 * @Version 1.0
 **/
@Data
public class PageResult<T> {

    private Long total;//总记录数
    private List<T> rows;//记录

    private T data;//返回数据

    public static PageResult ok(Long total, List rows) {
        PageResult p = new PageResult();
        p.setTotal(total);
        p.setRows(rows);
        return p;
    }

    public static PageResult ok(Object data) {
        PageResult p = new PageResult();
        p.setData(data);
        return p;
    }


}
