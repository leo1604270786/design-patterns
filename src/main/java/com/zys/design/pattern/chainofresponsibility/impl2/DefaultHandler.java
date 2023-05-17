package com.zys.design.pattern.chainofresponsibility.impl2;

import com.zys.design.pattern.chainofresponsibility.RequestParam;

public class DefaultHandler implements Handler {
    private RequestParam requestParam;

    public DefaultHandler(RequestParam requestParam) {
        this.requestParam = requestParam;
    }

    @Override
    public void handle() {
        System.out.println("i am defaultHandler, handled");
    }

    @Override
    public int getOrder() {
        int order = 10000;
        //读取配置里的优先级，读取不到默认很大
        return order;
    }
}
