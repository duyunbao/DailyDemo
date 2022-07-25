package com.example.dailydemo.exception;

/**
 * @author: dyb
 * @Date: 2022/7/25
 * @Description:
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -5770538329754222306L;

    private int code = 1;

    public BusinessException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public BusinessException(String message) {
        super(message);
    }


    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}