package com.zys.design.pattern.chainofresponsibility.impl2;

import com.zys.design.pattern.chainofresponsibility.RequestParam;

public class SpecialHandler implements Handler {


    @Override
    public boolean handle(RequestParam requestParam) {
        if ("special".equalsIgnoreCase(requestParam.getUserName())) {
            System.out.println("i am specialHandler, handled");
            return true;
        }
        return false;
    }
}
