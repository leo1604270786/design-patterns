package com.zys.design.pattern.templatemethod;

/**
 * @Description 登录模版
 * @Author leo
 * @Date 2020/8/27 9:49
 */
public abstract class LoginTemplate {
    /**
     * 登录逻辑（不允许子类重写）
     * @param loginParam 登录信息
     * @return 登录是否成功，true为成功，false为失败
     */
    public final boolean login(LoginParam loginParam) {
        if (loginParam == null) {
            return false;
        }
        //根据username查询数据库
        LoginParam dbLoginParam = findByUsername(loginParam.getUserName());
        if (dbLoginParam == null) {
            return false;
        }
        //对密码进行加密
        String encryptedPwd = encryptPassword(loginParam.getPassword());
        loginParam.setPassword(encryptedPwd);
        //返回信息比对结果
        return isMatch(dbLoginParam, loginParam);
    }

    /**
     * 登录信息比对
     * @param dbLoginParam 数据库中的登录信息
     * @param loginParam 登录请求信息
     * @return 比对结果 成功返回true，失败返回false
     */
    protected boolean isMatch(LoginParam dbLoginParam, LoginParam loginParam) {
        if (dbLoginParam == null || loginParam == null) {
            return false;
        }
        return dbLoginParam.getUserName().equals(loginParam.getUserName())
                && dbLoginParam.getPassword().equals(loginParam.getPassword());
    }

    /**
     * 对密码进行加密
     * @param password 密码
     */
    protected String encryptPassword(String password) {
        //默认不加密
        return password;
    }

    /**
     * 根据用户名查找
     * @param userName 用户名
     * @return 用户信息
     */
    protected abstract LoginParam findByUsername(String userName);
}
