package com.zys.design.pattern.abstractfactory;

/**
 * @Description 抽象工厂
 * @Author leo
 * @Date 2020/8/24 11:25
 */
public interface AbstractFactory {
    /**
     * 创建CPU
     * @return CPU对象
     */
    CPUApi createCpu();

    /**
     * 创建MainBoard
     * @return MainBoard对象
     */
    MainBoardApi createMainBoard();
}
