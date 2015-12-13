package com.apress.prospring4.ch5;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 17:12
 * Declaration: All Rights Reserved !!!
 */
public class SecurityManager {
    private static ThreadLocal<UserInfo> threadLocal = new ThreadLocal<>();

    public void login(String userName, String password) {
        threadLocal.set(new UserInfo(userName, password));
    }

    public void logout() {
        threadLocal.set(null);
    }

    public UserInfo getLoggedOnUser() {
        return threadLocal.get();
    }
}
