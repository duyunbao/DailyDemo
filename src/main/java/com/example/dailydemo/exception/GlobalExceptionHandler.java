package com.example.dailydemo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: dyb
 * @Date: 2022/7/25
 * @Description:
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public ApiResult exceptionHandler(Exception e) {
        return ApiResult.fail(2000, "服务异常");
    }


    @ExceptionHandler(value = BusinessException.class)
    public ApiResult businessExceptionHandler(BusinessException e) {
       return ApiResult.fail(e.getCode(),e.getMessage());
    }
}
