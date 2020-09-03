package com.zys.design.pattern.bridge;

/**
 * @Description 紧急消息：消息前拼接“紧急：”，并且监听消息的处理过程
 * @Author leo
 * @Date 2020/8/25 10:37
 */
public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMsg(String msg, String toUser) {
        msg = "紧急：" + msg;
        //调用父类发送消息的方法
        super.sendMsg(msg, toUser);
        //监听
        watch("msgId");
    }

    /**
     * 监听某消息的处理过程
     * @param msgId 消息ID
     * @return 监控数据
     */
    public Object watch(String msgId) {
        System.out.println("watch => msgId：" + msgId);
        //获取监控数据并返回
        return null;
    }
}
