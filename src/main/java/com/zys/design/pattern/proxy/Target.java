package com.zys.design.pattern.proxy;

/**
 * @Description 目标类（被代理类）
 * @Author leo
 * @Date 2020/8/24 17:06
 */
public class Target implements Api{
    @Override
    public void operation(String str) {
        System.out.println("call Target operation( " + str + " )");
    }
}
