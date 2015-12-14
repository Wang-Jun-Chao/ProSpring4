package com.apress.prospring4.ch5;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 14:24
 * Declaration: All Rights Reserved !!!
 */
public class WeakKeyCheckAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
            throws Throwable {
        if ((target instanceof KeyGenerator) && ("getKey".equals(method.getName()))) {
            long key = (Long) returnValue;

            if (key == KeyGenerator.WEAK_KEY) {
                throw new SecurityException("Key Generator generated a weak key. Try again");
            }
        }
    }
}
