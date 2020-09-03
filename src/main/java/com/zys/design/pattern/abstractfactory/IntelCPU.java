package com.zys.design.pattern.abstractfactory;

/**
 * @Description Intel CPU
 * @Author leo
 * @Date 2020/8/24 11:15
 */
public class IntelCPU implements CPUApi{
    /**
     * CPU针脚数
     */
    private int pins = 0;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU calculate, pins = " + pins);
    }
}
