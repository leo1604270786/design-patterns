package com.zys.design.pattern.decorator;

/**
 * @Description debug装饰器
 * @Author leo
 * @Date 2020/8/25 15:02
 */
public class DebugDecorator extends Decorator{
    public DebugDecorator(Person p) {
        super(p);
    }

    @Override
    String work() {
        return super.work() + ", debug";
    }
}
