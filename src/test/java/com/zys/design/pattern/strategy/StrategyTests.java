package com.zys.design.pattern.strategy;

import org.junit.Test;

/**
 * @Description 策略模式测试类
 * @Author leo
 * @Date 2020/8/27 11:19
 */
public class StrategyTests {
    @Test
    public void testStrategy() {
        //创建策略算法
        NormalPriceStrategy normalPriceStrategy = new NormalPriceStrategy();
        OldCustomerPriceStrategy oldCustomerPriceStrategy = new OldCustomerPriceStrategy();
        //创建上下文
        PriceContext priceContext1 = new PriceContext(normalPriceStrategy, "leo", 100);
        PriceContext priceContext2 = new PriceContext(oldCustomerPriceStrategy, "jeff", 100);
        //报价
        priceContext1.quote();
        priceContext2.quote();
    }
}
