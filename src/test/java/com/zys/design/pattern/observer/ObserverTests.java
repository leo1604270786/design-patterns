package com.zys.design.pattern.observer;

import org.junit.Test;

/**
 * @Description 观察者模式测试类
 * @Author leo
 * @Date 2020/8/26 17:06
 */
public class ObserverTests {

    @Test
    public void testObserver() {
        //创建目标对象
        NewsPaperSubject subject = new NewsPaperSubject();
        //创建多个观察者对象
        ReaderObserver readerObserver1 = new ReaderObserver("leo");
        ReaderObserver readerObserver2 = new ReaderObserver("jeff");
        //将观察者注册到目标对象中
        subject.attach(readerObserver1);
        subject.attach(readerObserver2);
        //修改目标对象的状态 触发通知
        subject.setContent("testObserver");
    }
}
