package com.apress.prospring4.ch5;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 17:12
 * Declaration: All Rights Reserved !!!
 */
public class UserInfo {
    private String userName;
    private String password;

    public UserInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
