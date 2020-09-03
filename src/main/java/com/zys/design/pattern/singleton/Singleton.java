package com.zys.design.pattern.singleton;

/**
 * @Description 单例模式 （创建型） 懒汉式
 * @Author leo
 * @Date 2020/8/21 15:43
 */
public class Singleton {
    //唯一实例
    private static volatile Singleton instance;
    //不允许外部创建实例
    private Singleton() {}

    /**
     * 返回唯一实例（懒加载）
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
