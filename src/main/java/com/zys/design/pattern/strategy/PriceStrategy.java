package com.zys.design.pattern.strategy;

/**
 * @Description 价格计算策略接口
 * @Author leo
 * @Date 2020/8/27 11:20
 */
public interface PriceStrategy {
    /**
     * 计算价格
     * @param goodsPrice 商品价格
     * @return 报价
     */
    double calcPrice(double goodsPrice);
}
