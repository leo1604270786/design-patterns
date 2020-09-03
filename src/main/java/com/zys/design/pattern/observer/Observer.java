package com.zys.design.pattern.observer;

/**
 * @Description 观察者接口
 * @Author leo
 * @Date 2020/8/26 16:54
 */
public interface Observer {
    /**
     * 观察目标状态发生改变时的回调
     * @param subject 目标对象
     */
    void update(Subject subject);
}
