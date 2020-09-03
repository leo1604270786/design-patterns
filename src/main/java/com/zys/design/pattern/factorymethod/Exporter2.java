package com.zys.design.pattern.factorymethod;

/**
 * @Description 导出器 通过参数选择具体的导出对象
 * @Author leo
 * @Date 2020/8/24 9:49
 */
public class Exporter2 {
    /**
     * 导出数据到文件
     * @param data 数据
     * @return 是否导出成功
     */
    public boolean export(int type, String data) {
        //获取具体导出对象实例
        ExportFileApi exportFileApi = factoryMethod(type);
        //调用导出对象的方法
        return exportFileApi.export(data);
    }

    /**
     * 参数化工厂方法 用于根据type创建具体的导出对象实例
     * @param type 导出对象类型
     * @return 具体的导出对象实例
     */
    protected ExportFileApi factoryMethod(int type) {
        ExportFileApi api = null;
        if (type == 1) {
            api = new ExportTxt();
        } else if (type == 2) {
            api = new ExportDB();
        }
        return api;
    }
}
