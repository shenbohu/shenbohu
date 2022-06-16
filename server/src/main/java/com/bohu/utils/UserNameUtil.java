package com.bohu.utils;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @ClassName UserNameUtil
 * @Author shenbohu
 * @Date 2022/6/1615:21
 * @Version 1.0
 **/
@Component
public class UserNameUtil {

    public <E> List<E> setNameValue(List<E> entitys ,String key) throws Exception {
        if (CollectionUtils.isEmpty(entitys)) {
            return entitys;
        }
        for (E entity : entitys) {
            Class<?> aClass = entity.getClass();
            Field declaredField = aClass.getDeclaredField(key);
            declaredField.setAccessible(true);
            Object o = declaredField.get(entity);
            declaredField.set(entity,"name");
        }
        return entitys;
    }


}
