package com.zys.design.pattern.bridge;

/**
 * @Description 通过邮箱发送消息
 * @Author leo
 * @Date 2020/8/25 10:27
 */
public class EmailMessage implements MessageImplementor{
    @Override
    public void send(String msg, String toUser) {
        System.out.println("通过Email发送 => 消息：" + msg + "，给：" + toUser);
    }
}
