package com.zys.design.pattern.bridge;

/**
 * @Description 通过短信发送消息
 * @Author leo
 * @Date 2020/8/25 10:29
 */
public class SmsMessage implements MessageImplementor{
    @Override
    public void send(String msg, String toUser) {
        System.out.println("通过SMS发送 => 消息：" + msg + "，给：" + toUser);
    }
}
