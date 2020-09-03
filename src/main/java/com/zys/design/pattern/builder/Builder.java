package com.zys.design.pattern.builder;

import java.util.Collection;

/**
 * @Description 构造者接口：定义了如何构建产品的各个部件
 * @Author leo
 * @Date 2020/8/24 14:43
 */
public interface Builder {
    /**
     * 构建产品头部
     * @param header
     */
    void buildHeader(Header header);

    /**
     * 构建产品尾部
     * @param bodies
     */
    void buildBody(Collection<Body> bodies);

    /**
     * 构建产品尾部
     * @param footer
     */
    void buildFooter(Footer footer);

    /**
     * 获取构造结果
     * @return
     */
    String getResult();
}
