package com.apress.prospring4.ch5;

import org.aspectj.lang.JoinPoint;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 19:39
 * Declaration: All Rights Reserved !!!
 */
public class MyAdvice {
    public void simpleBeforeAdvice(JoinPoint joinPoint) {
        System.out.println("Executing: " + joinPoint.getSignature().getDeclaringTypeName() + " "
                + joinPoint.getSignature().getName());
    }
}
