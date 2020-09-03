package com.zys.design.pattern.singleton;

/**
 * @Description 单例模式（创建型） 静态内部类
 * @Author leo
 * @Date 2020/8/21 16:12
 */
public class Singleton3 {
    //防止外部创建实例
    private Singleton3() {}

    /**
     * 静态内部类，只有首次调用时才会加载（懒加载）
     */
    private static class SingletonHolder {
        /**
         * 唯一实例，由静态初始化器来初始化，保证线程安全
         */
        private static Singleton3 instance = new Singleton3();
    }

    /**
     * 返回唯一实例
     * @return
     */
    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }
}
