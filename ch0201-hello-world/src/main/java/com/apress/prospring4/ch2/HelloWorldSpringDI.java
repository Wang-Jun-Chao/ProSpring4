package com.apress.prospring4.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-10-31
 * Time: 14:19
 * Declaration: All Rights Reserved !!!
 */
public class HelloWorldSpringDI {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
