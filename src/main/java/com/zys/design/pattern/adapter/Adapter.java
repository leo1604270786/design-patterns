package com.zys.design.pattern.adapter;

import java.util.List;

/**
 * @Description 适配器类，用于将LogFileApi接口适配新的接口LogDBApi
 * @Author leo
 * @Date 2020/8/26 14:43
 */
public class Adapter implements LogDBApi{
    /**
     * 被适配对象引用 通过文件操作日志
     */
    private LogFileApi adaptee;

    public Adapter(LogFileApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(Log log) {
        //从文件中读取出全部日志记录
        List<Log> logs = adaptee.readAllLogs();
        //添加
        logs.add(log);
        //写回
        adaptee.writeLogs(logs);
    }

    @Override
    public void removeLog(String logId) {
        List<Log> logs = adaptee.readAllLogs();
        logs.removeIf(log -> log.getLogId().equals(logId));
    }

    @Override
    public Log selectLog(String logId) {
        List<Log> logs = adaptee.readAllLogs();
        for (Log log : logs) {
            if (log.getLogId().equals(logId)) {
                return log;
            }
        }
        return null;
    }

    @Override
    public void updateLog(Log newLog) {
        List<Log> logs = adaptee.readAllLogs();
        //为了方便 先删除 再添加
        logs.removeIf(log -> log.getLogId().equals(newLog.getLogId()));
        logs.add(newLog);
        adaptee.writeLogs(logs);
    }
}
