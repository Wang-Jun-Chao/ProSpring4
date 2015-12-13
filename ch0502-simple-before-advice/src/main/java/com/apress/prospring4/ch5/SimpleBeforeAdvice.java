package com.apress.prospring4.ch5;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 11:05
 * Declaration: All Rights Reserved !!!
 */
public class SimpleBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before method: " + method.getName());
    }

    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SimpleBeforeAdvice());
        pf.setTarget(target);

        MessageWriter proxy = (MessageWriter) pf.getProxy();

        proxy.writeMessage();
    }
}
