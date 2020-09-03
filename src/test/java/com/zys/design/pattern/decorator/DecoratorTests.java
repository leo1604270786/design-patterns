package com.zys.design.pattern.decorator;

import org.junit.Test;

/**
 * @Description 装饰者模式测试类
 * @Author leo
 * @Date 2020/8/25 14:22
 */
public class DecoratorTests {
    @Test
    public void testDecorator() {
        //创建程序猿
        Person programmer = new Programmer();
        //创建各类装饰器
        Decorator javaDecorator = new JavaDecorator(programmer);
        Decorator debugDecorator = new DebugDecorator(programmer);
        //测试装饰结果
        System.out.println(javaDecorator.work());
        System.out.println(debugDecorator.work());

        //组合使用装饰器（注意顺序）
        System.out.println(new JavaDecorator(new DebugDecorator(programmer)).work());
        System.out.println(new DebugDecorator(new JavaDecorator(programmer)).work());
    }
}
