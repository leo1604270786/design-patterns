package com.zys.design.pattern.singleton;

import org.junit.Test;

/**
 * @Description 单例模式测试类
 * @Author leo
 * @Date 2020/8/21 16:22
 */
public class SingletonTests {

    @Test
    public void testEnumSingleton() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Singleton4.INSTANCE.hashCode());
            }).start();
        }

    }
}
