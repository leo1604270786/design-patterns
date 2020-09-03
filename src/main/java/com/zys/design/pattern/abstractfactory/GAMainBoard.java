package com.zys.design.pattern.abstractfactory;

/**
 * @Description 技嘉主板
 * @Author leo
 * @Date 2020/8/24 11:17
 */
public class GAMainBoard implements MainBoardApi{
    /**
     * CPU插孔数
     */
    private int cpuHoles = 0;

    public GAMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("GAMainBoard install CPU, cpuHoles = " + cpuHoles);
    }
}
