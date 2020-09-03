package com.zys.design.pattern.builder;

/**
 * @Description 产品尾部
 * @Author leo
 * @Date 2020/8/24 14:45
 */
public class Footer {
    /**
     * 用户名
     */
    private String userName;

    public Footer(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
