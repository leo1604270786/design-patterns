package com.zys.design.pattern.decorator;

/**
 * @Description Java装饰器
 * @Author leo
 * @Date 2020/8/25 15:00
 */
public class JavaDecorator extends Decorator{

    public JavaDecorator(Person p) {
        super(p);
    }

    @Override
    String work() {
        return "using java " + super.work();
    }
}
