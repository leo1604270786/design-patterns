package com.zys.design.pattern.builder;

import java.util.Collection;

/**
 * @Description 指导者：指导构造者创建产品
 * @Author leo
 * @Date 2020/8/24 14:52
 */
public class Director {
    /**
     * 构造者
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 根据一定的构建算法 创建出具体的产品
     * @param header
     * @param bodies
     * @param footer
     */
    public void construct(Header header, Collection<Body> bodies, Footer footer) {
        //先构建头部
        builder.buildHeader(header);
        //再构建主体
        builder.buildBody(bodies);
        //最后构建尾部
        builder.buildFooter(footer);
    }
}
