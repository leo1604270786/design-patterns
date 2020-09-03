package com.zys.design.pattern.bridge;

/**
 * @Description 普通消息：只管发送就行
 * @Author leo
 * @Date 2020/8/25 10:34
 */
public class CommonMessage extends AbstractMessage{
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMsg(String msg, String toUser) {
        //普通消息 直接调用父类发送消息的方法
        super.sendMsg(msg, toUser);
    }
}
