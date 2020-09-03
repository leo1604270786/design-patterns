package com.zys.design.pattern.factorymethod;

/**
 * @Description 文本格式导出器
 * @Author leo
 * @Date 2020/8/24 9:12
 */
public class TxtExporter extends Exporter {
    /**
     * 实现父类工厂方法，提供txt的导出接口实例
     * @return
     */
    @Override
    protected ExportFileApi factoryMethod() {
        //返回导出txt格式对象
        return new ExportTxt();
    }
}
