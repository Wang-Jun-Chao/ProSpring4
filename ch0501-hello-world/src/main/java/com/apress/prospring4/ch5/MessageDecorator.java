package com.apress.prospring4.ch5;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 09:47
 * Declaration: All Rights Reserved !!!
 */
public class MessageDecorator implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.print("Hello ");
        Object retVal = invocation.proceed();
        System.out.println("!");
        return retVal;
    }
}
