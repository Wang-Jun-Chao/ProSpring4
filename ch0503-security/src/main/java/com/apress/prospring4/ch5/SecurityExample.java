package com.apress.prospring4.ch5;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 17:16
 * Declaration: All Rights Reserved !!!
 */
public class SecurityExample {

    private static SecureBean getSecureBean() {
        SecureBean target = new SecureBean();

        SecurityAdvice advice = new SecurityAdvice();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(advice);

        return (SecureBean) factory.getProxy();
    }

    public static void main(String[] args) {
        SecurityManager mgr = new SecurityManager();

        SecureBean bean = getSecureBean();
        mgr.login("chris", "pwd");
        bean.writeSecureMessage();
        mgr.logout();

        try {
            mgr.login("invaliduser", "pwd");
            bean.writeSecureMessage();
        } catch(SecurityException ex) {
            System.out.println("Exception Caught: " + ex.getMessage());
        } finally {
            mgr.logout();
        }

        try {
            bean.writeSecureMessage();
        } catch(SecurityException ex) {
            System.out.println("Exception Caught: " + ex.getMessage());
        }
    }
}
