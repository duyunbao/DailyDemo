package com.example.dailydemo.enums;

/**
 * @author: dyb
 * @Date: 2022/7/22
 * @Description:
 */
public interface IBaseEnum<T> {


    T getValue();

    /**
     * 获取枚举描述
     *
     * @return 枚举描述
     */
    String getLabel();



}
