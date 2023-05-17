package com.zys.design.pattern.chainofresponsibility.impl2;

import com.zys.design.pattern.chainofresponsibility.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    private List<Handler> handlers = new ArrayList<>();

    public HandlerChain(RequestParam requestParam) {
        //初始化
        handlers.add(new DefaultHandler(requestParam));
        handlers.add(new SpecialHandler(requestParam));
        //倒序排序，优先级越小越高
        handlers.sort((h1, h2) -> Integer.compare(h2.getOrder(), h1.getOrder()));
    }

    public void handle() {
        System.out.println("before handle");

        for (Handler handler : handlers) {
            handler.handle();
        }

        System.out.println("after handle");
    }
}
