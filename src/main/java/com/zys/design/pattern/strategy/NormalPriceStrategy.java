package com.zys.design.pattern.strategy;

/**
 * @Description 普通价格计算策略：直接返回原价
 * @Author leo
 * @Date 2020/8/27 11:22
 */
public class NormalPriceStrategy implements PriceStrategy{
    @Override
    public double calcPrice(double goodsPrice) {
        return goodsPrice;
    }
}
