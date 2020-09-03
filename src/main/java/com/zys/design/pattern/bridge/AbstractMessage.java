package com.zys.design.pattern.bridge;

/**
 * @Description 抽象消息类型
 * @Author leo
 * @Date 2020/8/25 10:31
 */
public abstract class AbstractMessage {
    /**
     * 持有 消息发送实现 类型引用
     */
    private MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息
     * @param msg 消息内容
     * @param toUser 发送消息的目的用户
     */
    public void sendMsg(String msg, String toUser) {
        //调用消息实现中的方法发送消息
        impl.send(msg, toUser);
    }
}
