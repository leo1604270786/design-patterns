package com.zys.design.pattern.factorymethod;

/**
 * @Description 导出数据到DB文件格式对象
 * @Author leo
 * @Date 2020/8/24 9:06
 */
public class ExportDB implements ExportFileApi{
    /**
     * 导出数据到DB格式文件中
     * @param data 数据
     * @return 文件是否导出成功
     */
    @Override
    public boolean export(String data) {
        System.out.println("导出 {" + data + "} 到DB文件中");
        return true;
    }
}
