package com.apress.prospring4.ch5;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 09:48
 * Declaration: All Rights Reserved !!!
 */
public class HelloWorldAOPExample {
    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new MessageDecorator());
        pf.setTarget(target);

        MessageWriter proxy = (MessageWriter) pf.getProxy();
        target.writeMessage();
        System.out.println();
        proxy.writeMessage();
    }
}
