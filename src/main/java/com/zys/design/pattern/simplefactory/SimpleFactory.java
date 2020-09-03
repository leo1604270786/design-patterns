package com.zys.design.pattern.simplefactory;

import java.util.ResourceBundle;

/**
 * @Description 简单工厂模式（非标准设计模式）
 * 定义：提供一个创建实例的功能，无需关心其具体实现。被创建实例可以是 接口、抽象类、具体类。
 * 由于创建实例方法大多数情况下是static的，所以也称为 静态工厂。
 * @Author leo
 * @Date 2020/8/21 14:24
 */
public class SimpleFactory {
    /**
     * 外部无需创建工厂实例
     */
    private SimpleFactory(){}

    /**
     * 根据传入的 type 字段返回对应的Api实现类
     * @param type
     * @return
     */
    public static Api createApi(String type) {
        Api api = null;
        if ("A".equals(type)) {
            return new ApiImplA();
        } else if ("B".equals(type)) {
            return new ApiImplB();
        }
        return api;
    }

    /**
     * 通过读取配置文件中的 implClassName 配置项选择实现类
     * @return
     */
    public static Api createApi() {
        // 加载配置文件
        ResourceBundle resourceBundle = null;
        try {
            resourceBundle = ResourceBundle.getBundle("simplefactory");
        } catch (Exception e) {
            System.out.println("配置加载失败");
            e.printStackTrace();
        }
        //读取配置项 并创建实现类
        Api api = null;
        try {
            api = (Api) Class.forName(resourceBundle.getString("implClassName")).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
