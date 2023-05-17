package com.zys.design.pattern.chainofresponsibility.impl2;

import com.zys.design.pattern.chainofresponsibility.RequestParam;

public class SpecialHandler implements Handler {

    private RequestParam requestParam;

    public SpecialHandler(RequestParam requestParam) {
        this.requestParam = requestParam;
    }

    @Override
    public void handle() {
        if ("special".equalsIgnoreCase(requestParam.getUserName())) {
            System.out.println("i am specialHandler, handled");
        }
    }

    @Override
    public int getOrder() {
        int order = 10000;
        //读取配置里的优先级，读取不到默认很大
        return order;
    }
}
