package com.zys.design.pattern.proxy;

/**
 * @Description 代理类
 * @Author leo
 * @Date 2020/8/24 17:07
 */
public class Proxy implements Api{
    /**
     * 被代理对象的引用
     */
    private Target target;

    public Proxy(Target target) {
        this.target = target;
    }

    @Override
    public void operation(String str) {
        //被代理对象方法调用前
        System.out.println("before Target operation");
        //被代理对象方法调用
        target.operation(str);
        //被代理对象方法调用后
        System.out.println("after Target operation");
    }
}
