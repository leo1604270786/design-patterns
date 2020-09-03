package com.zys.design.pattern.adapter;

import java.util.List;

/**
 * @Description 通过文件操作日志
 * @Author leo
 * @Date 2020/8/26 14:05
 */
public interface LogFileApi {
    /**
     * 查看所有日志记录
     * @return 日志记录列表
     */
    List<Log> readAllLogs();

    /**
     * 批量写入日志
     * @param logs 日志记录列表
     */
    void writeLogs(List<Log> logs);
}
