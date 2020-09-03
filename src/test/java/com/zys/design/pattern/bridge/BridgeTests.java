package com.zys.design.pattern.bridge;

import org.junit.Test;

/**
 * @Description 桥接模式测试类
 * @Author leo
 * @Date 2020/8/25 10:46
 */
public class BridgeTests {

    @Test
    public void testBridge() {
        //创建消息发送方式
        MessageImplementor impl = new SmsMessage();
        //创建消息类型
        UrgencyMessage urgencyMessage = new UrgencyMessage(impl);
        //发送紧急消息
        urgencyMessage.sendMsg("testBridge", "leo");

        new CommonMessage(impl).sendMsg("testBridge", "leo");
        new CommonMessage(new EmailMessage()).sendMsg("testBridge", "leo");
        new SpecialUrgencyMessage(new EmailMessage()).sendMsg("testBridge", "leo");
    }
}
