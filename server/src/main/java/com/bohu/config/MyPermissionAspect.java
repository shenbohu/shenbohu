package com.bohu.config;

import com.alibaba.fastjson.JSONObject;
import com.bohu.entity.PageResult;
import com.bohu.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName MyPermissionAspect
 * @Author shenbohu
 * @Date 2022/7/2117:43
 * @Version 1.0
 **/
@Component
@Aspect
@Slf4j
public class MyPermissionAspect implements Ordered {
    @Pointcut("execution(* com.bohu.controller..*(..))")
    public void permissionTest() {

    }

    @Around("permissionTest()")
    public Object doPermission(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        String typeName = signature.getReturnType().getTypeName();
        MyPermission myPermission = method.getAnnotation(MyPermission.class);
        if (myPermission == null) {
            return joinPoint.proceed();
        }

        //判断是否需要数据权限
        boolean required = myPermission.required();
        if (!required) {
            return joinPoint.proceed();
        }

        List args = Arrays.asList(joinPoint.getArgs());
        log.info(args.toString());

        // JSONObject json = JSONObject.parseObject(String.valueOf(args[0]));
        String username = myPermission.username();
        if (!"admin1".equals(username)) {
            if (Objects.equals("com.bohu.entity.PageResult", typeName)) {
                return PageResult.ok("需要" + username + "权限");
            } else {
                return Result.ok("需要" + username + "权限");
            }
        }

        return joinPoint.proceed();
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
