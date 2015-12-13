package com.apress.prospring4.ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-11-07
 * Time: 17:39
 * Declaration: All Rights Reserved !!!
 */
public class DependencyPull {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
