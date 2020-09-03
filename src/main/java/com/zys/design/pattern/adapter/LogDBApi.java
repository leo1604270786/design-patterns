package com.zys.design.pattern.adapter;

/**
 * @Description 通过数据库操作日志接口（系统升级 替换通过文件操作日志接口）
 * @Author leo
 * @Date 2020/8/26 14:35
 */
public interface LogDBApi {
    /**
     * 添加日志
     * @param log 日志记录
     */
    void createLog(Log log);

    /**
     * 删除日志
     * @param logId 日志ID
     */
    void removeLog(String logId);

    /**
     * 查询日志
     * @param logId 日志ID
     * @return 日志记录
     */
    Log selectLog(String logId);

    /**
     * 更新日志
     * @param newLog 修改后的日志记录
     */
    void updateLog(Log newLog);
}
