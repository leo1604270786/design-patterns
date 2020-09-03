package com.zys.design.pattern.simplefactory;

import org.junit.Test;

/**
 * @Description 简单工厂测试类
 * @Author leo
 * @Date 2020/8/24 17:13
 */
public class SimpleFactoryTests {

    @Test
    public void testSimpleFactory() {
        Api api = SimpleFactory.createApi("A");
        api.operation("简单工厂模式");
        // 通过配置文件 无需传递参数
        Api api2 = SimpleFactory.createApi();
        api2.operation("简单工厂（配置文件）");
    }
}

