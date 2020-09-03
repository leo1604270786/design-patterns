package com.zys.design.pattern.templatemethod;

/**
 * @Description 管理员登录
 * @Author leo
 * @Date 2020/8/27 10:08
 */
public class AdminLogin extends LoginTemplate{
    /**
     * 通过用户名查询
     * @param userName 用户名
     * @return
     */
    @Override
    protected LoginParam findByUsername(String userName) {
        //不从数据库查询  直接返回一个固定的
        return new LoginParam(userName, "admin");
    }

    /**
     * 加密
     * @param password 密码
     * @return
     */
    @Override
    protected String encryptPassword(String password) {
        //演示一下实现加密
        System.out.println("使用SHA256加密");
        return super.encryptPassword(password);
    }
}
