package com.zys.design.pattern.factorymethod;

/**
 * @Description 导出文本格式文件对象
 * @Author leo
 * @Date 2020/8/24 9:03
 */
public class ExportTxt implements ExportFileApi{
    /**
     * 导出数据到txt类型文件中
     * @param data 数据
     * @return 是否导出成功
     */
    @Override
    public boolean export(String data) {
        System.out.println("导出 {" + data + "} 到txt文件中");
        return true;
    }
}
