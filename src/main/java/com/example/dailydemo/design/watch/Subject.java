package com.example.dailydemo.design.watch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: dyb
 * @Date: 2022/6/28
 * @Description:
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}