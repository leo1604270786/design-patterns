package com.zys.design.pattern.bridge;

/**
 * @Description 消息发送实现接口
 * @Author leo
 * @Date 2020/8/25 10:25
 */
public interface MessageImplementor {
    /**
     * 发送消息
     * @param msg 消息内容
     * @param toUser 消息发送目的对象
     */
    void send(String msg, String toUser);
}
