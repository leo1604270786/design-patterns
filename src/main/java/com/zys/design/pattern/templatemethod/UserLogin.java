package com.zys.design.pattern.templatemethod;

/**
 * @Description 用户登录
 * @Author leo
 * @Date 2020/8/27 10:06
 */
public class UserLogin extends LoginTemplate{
    /**
     * 通过用户名查找
     * @param userName 用户名
     * @return
     */
    @Override
    protected LoginParam findByUsername(String userName) {
        //不从数据库查询  直接返回一个固定的
        return new LoginParam(userName, "user");
    }

    @Override
    protected boolean isMatch(LoginParam dbLoginParam, LoginParam loginParam) {
        //演示一下重写比对规则
        System.out.println("UserLogin重写isMatch");
        return super.isMatch(dbLoginParam, loginParam);
    }
}
