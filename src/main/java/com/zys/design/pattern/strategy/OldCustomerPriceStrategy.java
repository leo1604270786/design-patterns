package com.zys.design.pattern.strategy;

/**
 * @Description 老客户价格计算策略：9折
 * @Author leo
 * @Date 2020/8/27 11:23
 */
public class OldCustomerPriceStrategy implements PriceStrategy{

    @Override
    public double calcPrice(double goodsPrice) {
        return goodsPrice * 0.9;
    }
}
