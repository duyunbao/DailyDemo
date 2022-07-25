package com.example.dailydemo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: dyb
 * @Date: 2022/7/25
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 411731814484355577L;
    private int responseCode;
    private String responseMsg;
    private boolean isSuccess;
    private T data;

    public String toString() {
        return "ApiResult(responseCode=" + this.getResponseCode() + ", responseMsg=" + this.getResponseMsg() + ", isSuccess=" + this.isSuccess() + ", data=" + this.getData() + ")";
    }

    public static ApiResult<String> success() {
        return success("success");
    }

    public static <T> ApiResult<T> success(T data) {
        return (new ApiResult()).setResponseCode(0).setResponseMsg("操作成功").setSuccess(true).setData(data);
    }

    public static <T> ApiResult<T> success(int code, String message, T data) {
        return (new ApiResult()).setResponseCode(code).setResponseMsg(message).setSuccess(true).setData(data);
    }

    public static ApiResult fail() {
        return fail(-1,"操作失败");
    }

    public static ApiResult fail(String message) {
        return fail(-1, message);
    }

    public static <T> ApiResult<T> fail(int code,String message) {
        return (new ApiResult()).setResponseCode(code).setResponseMsg(message).setSuccess(false);
    }

    public static <T> ApiResult<T> fail(int code, String message, T data) {
        return (new ApiResult()).setResponseCode(code).setResponseMsg(message).setSuccess(false).setData(data);
    }
}