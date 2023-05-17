package com.zys.design.pattern.chainofresponsibility;

import com.zys.design.pattern.chainofresponsibility.impl2.DefaultHandler;
import com.zys.design.pattern.chainofresponsibility.impl2.HandlerChain;
import com.zys.design.pattern.chainofresponsibility.impl2.SpecialHandler;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Iterator;

/**
 * @Description 责任链模式测试类
 * @Author leo
 * @Date 2020/8/27 11:36
 */
public class ChainOfResponsibilityTests {
    @Test
    public void testChainOfResponsibility() {
        //创建请求参数对象
        RequestParam param1 = new RequestParam("leo", LocalDateTime.now(), 400);
        RequestParam param2 = new RequestParam("jeff", LocalDateTime.now(), 400);
        //500 < fee < 2000
        RequestParam param3 = new RequestParam("leo", LocalDateTime.now(), 1500);
        RequestParam param4 = new RequestParam("jeff", LocalDateTime.now(), 1500);
        //2000 < fee
        RequestParam param5 = new RequestParam("leo", LocalDateTime.now(), 3000);
        RequestParam param6 = new RequestParam("jeff", LocalDateTime.now(), 3000);
        //创建责任对象
        GeneralManager generalManager = new GeneralManager();
        DepManager depManager = new DepManager();
        ProjectManager projectManager = new ProjectManager();
        //组合责任链
        projectManager.setSuccessor(depManager);
        depManager.setSuccessor(generalManager);
        //向责任链头部发起请求
        projectManager.handlerRequest(param1);
        projectManager.handlerRequest(param2);
        projectManager.handlerRequest(param3);
        projectManager.handlerRequest(param4);
        projectManager.handlerRequest(param5);
        projectManager.handlerRequest(param6);
    }

    @Test
    public void testChainOfResponsibility2() {
//        RequestParam specialParam = new RequestParam("special", LocalDateTime.now(), 0);
//        RequestParam defaultParam = new RequestParam("default", LocalDateTime.now(), 0);
//
//        HandlerChain handlerChain = new HandlerChain();
//        handlerChain.addHandler(new SpecialHandler());
//        handlerChain.addHandler(new DefaultHandler());
//        handlerChain.handle(defaultParam);
//        System.out.println("=============================");
//        handlerChain.handle(specialParam);

        RequestParam requestParam = new RequestParam("default", LocalDateTime.now(), 0);

        HandlerChain handlerChain = new HandlerChain(requestParam);
        handlerChain.handle();
    }
}
