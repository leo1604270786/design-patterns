package com.zys.design.pattern.templatemethod;

/**
 * @Description 登录信息
 * @Author leo
 * @Date 2020/8/27 9:48
 */
public class LoginParam {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;

    public LoginParam(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
