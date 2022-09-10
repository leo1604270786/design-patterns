package com.zys.design.pattern.chainofresponsibility.impl2;

import com.zys.design.pattern.chainofresponsibility.RequestParam;

public interface Handler {

    boolean handle(RequestParam requestParam);
}
