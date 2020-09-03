package com.zys.design.pattern.decorator;

/**
 * @Description 程序猿
 * @Author leo
 * @Date 2020/8/25 14:56
 */
public class Programmer extends Person{
    @Override
    String work() {
        return "create bug";
    }
}
