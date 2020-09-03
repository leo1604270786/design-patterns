package com.zys.design.pattern.decorator;

/**
 * @Description 装饰器公共抽象类
 * @Author leo
 * @Date 2020/8/25 14:58
 */
public abstract class Decorator extends Person{
    /**
     * 持有被装饰对象引用
     */
    protected Person p;

    public Decorator(Person p) {
        this.p = p;
    }

    @Override
    String work() {
        return p.work();
    }
}
