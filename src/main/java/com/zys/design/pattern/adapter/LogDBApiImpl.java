package com.zys.design.pattern.adapter;

/**
 * @Description DB操作日志实现类
 * @Author leo
 * @Date 2020/8/26 14:38
 */
public class LogDBApiImpl implements LogDBApi{
    /**
     * 日志文件路径
     */
    private String logFilePath = "adapterlog.log";

    public LogDBApiImpl(String logFilePath) {
        if (null != logFilePath && !"".equals(logFilePath)) {
            this.logFilePath = logFilePath;
        }
    }

    @Override
    public void createLog(Log log) {
        //不操作数据库 模拟一下
        System.out.println("LogDBApiImpl => createLog()" + "log = " + log);
    }

    @Override
    public void removeLog(String logId) {
        System.out.println("LogDBApiImpl => removeLog()" + " logId = " + logId);
    }

    @Override
    public Log selectLog(String logId) {
        System.out.println("LogDBApiImpl => selectLog()" + " logId = " + logId);
        return null;
    }

    @Override
    public void updateLog(Log newLog) {
        System.out.println("LogDBApiImpl => updateLog()" + " newLog = " + newLog);
    }
}
