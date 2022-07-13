package com.example.dailydemo.design.watch;

/**
 * @author: dyb
 * @Date: 2022/6/28
 * @Description:
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}