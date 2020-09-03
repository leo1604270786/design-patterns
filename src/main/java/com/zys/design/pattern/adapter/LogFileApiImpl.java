package com.zys.design.pattern.adapter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.util.List;

/**
 * @Description 通过文件操作日志实现类
 * @Author leo
 * @Date 2020/8/26 14:10
 */
public class LogFileApiImpl implements LogFileApi{

    private String logFilePath = "adapterlog.log";

    public LogFileApiImpl(String logFilePath) {
        if (null != logFilePath && !"".equals(logFilePath.trim())) {
            this.logFilePath = logFilePath;
        }
    }

    @Override
    public List<Log> readAllLogs() {
        List<Log> logs = null;
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        this.getClass().getClassLoader().getResourceAsStream(logFilePath))
        )){
            logs = (List<Log>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return logs;
    }

    @Override
    public void writeLogs(List<Log> logs) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(this.getClass().getClassLoader().getResource(logFilePath).getFile()))
        )){
            oos.writeObject(logs);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
