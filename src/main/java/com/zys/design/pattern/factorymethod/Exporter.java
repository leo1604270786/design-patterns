package com.zys.design.pattern.factorymethod;

/**
 * @Description 抽象导出器 包含导出业务逻辑
 * @Author leo
 * @Date 2020/8/24 9:08
 */
public abstract class Exporter {
    /**
     * 导出数据到文件
     * @param data 数据
     * @return 是否导出成功
     */
    public boolean export(String data) {
        //获取具体导出对象实例
        ExportFileApi exportFileApi = factoryMethod();
        //调用导出对象的方法
        return exportFileApi.export(data);
    }

    /**
     * 工厂方法 用于创建具体的导出对象实例（由子类实现）
     * @return 具体的导出对象实例
     */
    protected abstract ExportFileApi factoryMethod();
}
