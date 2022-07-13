package com.example.dailydemo.design.watch;

/**
 * @author: dyb
 * @Date: 2022/6/28
 * @Description:
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}