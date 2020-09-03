package com.zys.design.pattern.proxy;

import org.junit.Test;

/**
 * @Description 代理模式测试类
 * @Author leo
 * @Date 2020/8/24 17:09
 */
public class ProxyTests {

    @Test
    public void testProxy() {
        //创建代理对象
        Api api = new Proxy(new Target());
        //调用代理对象方法
        api.operation("ProxyTest");
    }
}
