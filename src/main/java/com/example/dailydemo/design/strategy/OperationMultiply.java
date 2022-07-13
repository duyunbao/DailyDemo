package com.example.dailydemo.design.strategy;

/**
 * @author: dyb
 * @Date: 2022/6/28
 * @Description:
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}