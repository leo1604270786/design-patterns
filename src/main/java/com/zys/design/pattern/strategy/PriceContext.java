package com.zys.design.pattern.strategy;

/**
 * @Description 价格计算上下文
 * @Author leo
 * @Date 2020/8/27 11:25
 */
public class PriceContext {
    /**
     * 价格计算策略对象引用
     */
    private PriceStrategy strategy;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 商品价格
     */
    private double goodsPrice;

    public PriceContext(PriceStrategy strategy, String userName, double goodsPrice) {
        this.strategy = strategy;
        this.userName = userName;
        this.goodsPrice = goodsPrice;
    }

    /**
     * 报价
     * @return 报价结果
     */
    public double quote() {
        double price = strategy.calcPrice(goodsPrice);
        System.out.println("用户：" + userName + " 的最终报价为：" + price);
        return price;
    }
}
