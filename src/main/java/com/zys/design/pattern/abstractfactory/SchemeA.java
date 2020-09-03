package com.zys.design.pattern.abstractfactory;

/**
 * @Description 方案A：IntelCPU + GAMainBoard
 * @Author leo
 * @Date 2020/8/24 11:29
 */
public class SchemeA implements AbstractFactory{
    @Override
    public CPUApi createCpu() {
        return new IntelCPU(1);
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new GAMainBoard(1);
    }
}
