package com.zys.design.pattern.abstractfactory;

import org.junit.Test;

/**
 * @Description 抽象工厂测试类
 * @Author leo
 * @Date 2020/8/24 11:33
 */
public class AbstractFactoryTests {

    @Test
    public void testAbstractFactory() {
        //选择一个具体的方案
        AbstractFactory factory = new SchemeA();
        //创建CPU
        CPUApi cpu = factory.createCpu();
        //创建主板
        MainBoardApi mainBoard = factory.createMainBoard();
        //测试CPU和主板
        cpu.calculate();
        mainBoard.installCPU();
        //完成装机
    }
}
