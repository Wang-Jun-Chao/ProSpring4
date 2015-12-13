package com.apress.prospring4.ch5;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 17:13
 * Declaration: All Rights Reserved !!!
 */
public class SecurityAdvice implements MethodBeforeAdvice {
    private SecurityManager securityManager;

    public SecurityAdvice() {
        this.securityManager = new SecurityManager();
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        UserInfo user = securityManager.getLoggedOnUser();

        if (user == null) {
            System.out.println("No user authenticated");
            throw new SecurityException("You must login before attempting to invoke the method: "
                    + method.getName());
        } else if ("chris".equals(user.getUserName())) {
            System.out.println("Logged in user is chris - OKAY!");
        } else {
            System.out.println("Logged in user is " + user.getUserName() + " NOT GOOD :(");
            throw new SecurityException("User " + user.getUserName() + " is not allowed access to method "
                    + method.getName());
        }
    }
}
