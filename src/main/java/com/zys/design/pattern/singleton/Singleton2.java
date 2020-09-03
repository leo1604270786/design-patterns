package com.zys.design.pattern.singleton;

/**
 * @Description 单例模式（创建型） 饿汉式
 * @Author leo
 * @Date 2020/8/21 15:50
 */
public class Singleton2 {
    //先创建一个唯一实例
    private static Singleton2 instance = new Singleton2();
    //防止外部创建实例
    private Singleton2() {}

    /**
     * 返回唯一实例
     * @return
     */
    public static Singleton2 getInstance() {
        return instance;
    }
}
