package com.zys.design.pattern.bridge;

/**
 * @Description 特急消息：消息前拼接“特急：”，并且消息一定时间内未处理时进行催促
 * @Author leo
 * @Date 2020/8/25 10:41
 */
public class SpecialUrgencyMessage extends AbstractMessage{

    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMsg(String msg, String toUser) {
        msg = "特急：" + msg;
        //调用父类发送消息的方法
        super.sendMsg(msg, toUser);
        //催促
        hurry("msgId");
    }

    /**
     * 催促某消息的处理
     * @param msgId 消息ID
     */
    public void hurry(String msgId) {
        System.out.println("hurry => msgId：" + msgId);
        //催促逻辑
    }
}
