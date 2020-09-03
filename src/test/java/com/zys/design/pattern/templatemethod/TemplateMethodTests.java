package com.zys.design.pattern.templatemethod;

import org.junit.Test;

/**
 * @Description 模版方法模式测试类
 * @Author leo
 * @Date 2020/8/27 9:45
 */
public class TemplateMethodTests {
    @Test
    public void testTemplateMethod() {
        //创建登录请求参数
        LoginParam user = new LoginParam("leo", "user");
        LoginParam admin = new LoginParam("leo", "admin");

        //创建登录逻辑对象
        UserLogin userLogin = new UserLogin();
        AdminLogin adminLogin = new AdminLogin();
        //登录测试
        System.out.println("user => userLogin ： " + userLogin.login(user));
        System.out.println("user => AdminLogin ： " + adminLogin.login(user));
        System.out.println("admin => userLogin ： " + userLogin.login(admin));
        System.out.println("admin => AdminLogin ： " + adminLogin.login(admin));
    }
}
