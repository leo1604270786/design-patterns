package com.zys.design.pattern.builder;

import java.time.LocalDate;

/**
 * @Description 产品头部
 * @Author leo
 * @Date 2020/8/24 14:44
 */
public class Header {
    /**
     * 文件名
     */
    private String fileName;
    /**
     * 创建时间
     */
    private LocalDate createDate;

    public Header(String fileName, LocalDate createDate) {
        this.fileName = fileName;
        this.createDate = createDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
