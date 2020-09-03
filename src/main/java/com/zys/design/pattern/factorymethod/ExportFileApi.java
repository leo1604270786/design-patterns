package com.zys.design.pattern.factorymethod;

/**
 * @Description 导出文件Api
 * @Author leo
 * @Date 2020/8/24 9:02
 */
public interface ExportFileApi {
    /**
     * 导出数据到文件中
     * @param data 数据
     * @return 是否导出成功
     */
    boolean export(String data);
}
