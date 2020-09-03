package com.zys.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 目标对象（被观察对象）
 * @Author leo
 * @Date 2020/8/26 16:53
 */
public class Subject {
    /**
     * 观察者对象列表
     */
    List<Observer> observers = new ArrayList<>();

    /**
     * 观察者注册
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 观察者注销
     * @param observer 观察者对象
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者对象
     */
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
