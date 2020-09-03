package com.zys.design.pattern.factorymethod;

import org.junit.Test;

/**
 * @Description 工厂方法测试类
 * @Author leo
 * @Date 2020/8/24 9:18
 */
public class FactoryMethodTests {

    @Test
    public void testFactoryMethod() {
        //客户端创建具体的导出器
        Exporter exporter = new TxtExporter();
        //调用导出方法
        exporter.export("factoryMethodTest");
    }

    @Test
    public void testFactoryMethod2() {
        //客户端创建具体的导出器
        Exporter2 exporter = new Exporter2();
        //调用导出方法
        exporter.export(1,"factoryMethodTest");
    }
}
