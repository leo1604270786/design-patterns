package com.zys.design.pattern.observer;

/**
 * @Description 读者（观察者）
 * @Author leo
 * @Date 2020/8/26 17:03
 */
public class ReaderObserver implements Observer{
    /**
     * 读者姓名
     */
    private String name;

    public ReaderObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        /*
         * 拉模式（主动获取目标对象的状态）
         * 如果为推模式的话，会通过方法参数直接传递所需数据，不需要主动通过目标对象获取
         */
        System.out.println(name + " 收到了报纸，报纸内容为：" + ((NewsPaperSubject)subject).getContent());

    }
}
