package com.example.dailydemo.design.strategy;

/**
 * @author: dyb
 * @createDate: 2022/6/28
 * @description: 创建实现接口的实体类
 */
public class OperationAdd implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
