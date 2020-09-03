package com.zys.design.pattern.abstractfactory;

/**
 * @Description AMD CPU
 * @Author leo
 * @Date 2020/8/24 11:17
 */
public class AmdCPU implements CPUApi{
    /**
     * CPU针脚数
     */
    private int pins = 0;

    public AmdCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU calculate, pins = " + pins);
    }
}
