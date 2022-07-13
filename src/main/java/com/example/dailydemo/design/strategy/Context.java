package com.example.dailydemo.design.strategy;

/**
 * @author: dyb
 * @Date: 2022/6/28
 * @Description:
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}