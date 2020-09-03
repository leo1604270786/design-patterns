package com.zys.design.pattern.observer;

/**
 * @Description 报社（目标对象）
 * @Author leo
 * @Date 2020/8/26 16:56
 */
public class NewsPaperSubject extends Subject{
    /**
     * 报纸内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //状态发生变化，通知所有观察者
        super.notifyObservers();
    }
}
