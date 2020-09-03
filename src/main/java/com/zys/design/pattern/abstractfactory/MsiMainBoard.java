package com.zys.design.pattern.abstractfactory;

/**
 * @Description 微星主板
 * @Author leo
 * @Date 2020/8/24 11:18
 */
public class MsiMainBoard implements MainBoardApi{
    /**
     * CPU插孔数
     */
    private int cpuHoles = 0;

    public MsiMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("MsiMainBoard install CPU, cpuHoles = " + cpuHoles);
    }
}
