package com.example.dailydemo.exception;

/**
 * @author: dyb
 * @Date: 2022/7/25
 * @Description:
 */
public class AssertUtil {
    public AssertUtil() {
    }

    /**
     * 抛出异常(默认错误1000)
     *
     * @param message
     */
    public static void businessInvalid(String message) {
        throw new BusinessException(1000, message);
    }

    /**
     * 表达式为真即抛出异常(默认错误1000)
     *
     * @param expression
     * @param message
     */
    public static void businessInvalid(boolean expression, String message) {
        if (expression) {
            throw new BusinessException(1000, message);
        }
    }

    /**
     * 表达式为真即抛出异常
     *
     * @param expression
     * @param message
     */
    public static void businessInvalid(boolean expression, int code, String message) {
        if (expression) {
            throw new BusinessException(code, message);
        }
    }
}