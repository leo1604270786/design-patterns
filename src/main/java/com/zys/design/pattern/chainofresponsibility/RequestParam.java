package com.zys.design.pattern.chainofresponsibility;

import java.time.LocalDateTime;

/**
 * @Description 请求参数
 * @Author leo
 * @Date 2020/8/27 14:50
 */
public class RequestParam {
    /**
     * 请求发起人
     */
    private String userName;
    /**
     * 请求发起时间
     */
    private LocalDateTime requestTime;
    /**
     * 请求费用
     */
    private double fee;

    public RequestParam(String userName, LocalDateTime requestTime, double fee) {
        this.userName = userName;
        this.requestTime = requestTime;
        this.fee = fee;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
