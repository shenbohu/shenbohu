package com.bohu.config;

import com.bohu.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName BaseExceptionHandler
 * @Author shenbohu
 * @Date 2022/6/1615:45
 * @Version 1.0
 **/
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result Exception(Exception e , HttpServletRequest request) {
        e.printStackTrace();
        return Result.error(e.getMessage());
    }
}
