package com.zys.design.pattern.chainofresponsibility.impl2;

import com.zys.design.pattern.chainofresponsibility.RequestParam;

public class DefaultHandler implements Handler {

    @Override
    public boolean handle(RequestParam requestParam) {
        System.out.println("i am defaultHandler, handled");
        return true;
    }
}
