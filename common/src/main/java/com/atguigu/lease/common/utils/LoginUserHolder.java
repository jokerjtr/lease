package com.atguigu.lease.common.utils;

import com.atguigu.lease.common.login.LoginUser;

/**
 * @author lhz
 * @Date 2024/6/3 19:13
 */
public class LoginUserHolder {
    public static ThreadLocal<LoginUser> threadLocal = new ThreadLocal<>();

    public static void setLoginUser(LoginUser loginUser) {
        threadLocal.set(loginUser);
    }

    public static LoginUser getLoginUser() {
        return threadLocal.get();
    }

    public static void clear() {
        threadLocal.remove();
    }
}
