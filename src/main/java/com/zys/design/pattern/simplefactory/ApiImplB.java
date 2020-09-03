package com.zys.design.pattern.simplefactory;

/**
 * @Description Api接口实现类B
 * @Author leo
 * @Date 2020/8/21 14:25
 */
public class ApiImplB implements Api {
    public void operation(String s) {
        System.out.println(s + "：ApiImplB => operation()");
    }
}
