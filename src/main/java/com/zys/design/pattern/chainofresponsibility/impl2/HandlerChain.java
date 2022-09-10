package com.zys.design.pattern.chainofresponsibility.impl2;

import com.zys.design.pattern.chainofresponsibility.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        if (handler != null) {
            handlers.add(handler);
        }
    }

    public void handle(RequestParam requestParam) {
        System.out.println("before handle");

        for (Handler handler : handlers) {
            if (handler.handle(requestParam)) {
                break;
            }
        }

        System.out.println("after handle");
    }
}
