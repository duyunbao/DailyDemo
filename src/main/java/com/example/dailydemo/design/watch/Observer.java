package com.example.dailydemo.design.watch;

/**
 * @author: dyb
 * @Date: 2022/6/28
 * @Description:
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}