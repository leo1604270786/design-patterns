package com.zys.design.pattern.factorymethod;

/**
 * @Description DB格式文件导出器
 * @Author leo
 * @Date 2020/8/24 9:15
 */
public class DBExporter extends Exporter {
    /**
     * 实现父类工厂方法，提供DB导出接口实例
     * @return
     */
    @Override
    protected ExportFileApi factoryMethod() {
        //返回DB格式导出对象
        return new ExportDB();
    }
}
