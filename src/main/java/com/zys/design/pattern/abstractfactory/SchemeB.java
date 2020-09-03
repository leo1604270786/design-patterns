package com.zys.design.pattern.abstractfactory;

/**
 * @Description 方案B：AmdCPU + MsiMainBoard
 * @Author leo
 * @Date 2020/8/24 11:30
 */
public class SchemeB implements AbstractFactory {
    @Override
    public CPUApi createCpu() {
        return new AmdCPU(2);
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new MsiMainBoard(2);
    }
}
