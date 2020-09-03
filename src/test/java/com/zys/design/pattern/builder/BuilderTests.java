package com.zys.design.pattern.builder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description 建造者模式测试类
 * @Author leo
 * @Date 2020/8/24 15:14
 */
public class BuilderTests {
    private Header header;
    private Collection<Body> bodies;
    private Footer footer;

    @Before
    public void init() {
        header = new Header("builderTest", LocalDate.now());
        bodies = new ArrayList<>();
        bodies.add(new Body("1", "10"));
        bodies.add(new Body("2", "16"));
        footer = new Footer("leo");
    }

    @Test
    public void testTxtBuilder() {
        //创建Builder
        TxtBuilder txtBuilder = new TxtBuilder();
        //创建Director
        Director director = new Director(txtBuilder);
        //构建产品
        director.construct(header, bodies, footer);
        //获取结果
        System.out.println("TxtBuilder： \n" + txtBuilder.getResult());
    }

    @Test
    public void testXmlBuilder() {
        //创建Builder
        XmlBuilder xmlBuilder = new XmlBuilder();
        //创建Director
        Director director = new Director(xmlBuilder);
        //构建产品
        director.construct(header, bodies, footer);
        //获取结果
        System.out.println("TxtBuilder： \n" + xmlBuilder.getResult());
    }
}
