package com.zys.design.pattern.simplefactory;

/**
 * @Description Api接口实现类A
 * @Author leo
 * @Date 2020/8/21 14:24
 */
public class ApiImplA implements Api {
    public void operation(String s) {
        System.out.println(s + "：ApiImplA => operation()");
    }
}
