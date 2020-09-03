package com.zys.design.pattern.adapter;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 适配器测试类
 * @Author leo
 * @Date 2020/8/26 14:04
 */
public class AdapterTests {

    @Test
    public void testLogFileApi() {
        Log log = new Log();
        log.setLogId("001");
        log.setCreateTime(LocalDateTime.now());
        log.setUserName("leo");

        List<Log> logs = new ArrayList<>();
        logs.add(log);

        LogFileApi logFileApi = new LogFileApiImpl(null);
        logFileApi.writeLogs(logs);

        System.out.println("logs ：\n" + logFileApi.readAllLogs());
    }

    @Test
    public void testLogDBApi() {
        Log log = new Log();
        log.setLogId("002");
        log.setCreateTime(LocalDateTime.now());
        log.setUserName("leo");

        List<Log> logs = new ArrayList<>();
        logs.add(log);

        LogDBApi logDBApi = new LogDBApiImpl(null);
        logDBApi.createLog(log);
        System.out.println("logs ：\n" + logDBApi.selectLog("002"));
    }

    @Test
    public void testAdapter() {
        Log log = new Log();
        log.setLogId("003");
        log.setCreateTime(LocalDateTime.now());
        log.setUserName("leo");

        //通过适配器 复用LogFileApiImpl功能
        LogDBApi logDBApi = new Adapter(new LogFileApiImpl(null));
        logDBApi.createLog(log);
        System.out.println("logs ：\n" + logDBApi.selectLog("003"));
    }
}
