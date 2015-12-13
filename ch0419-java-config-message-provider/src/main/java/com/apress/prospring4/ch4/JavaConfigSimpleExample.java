package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 16:15
 * Declaration: All Rights Reserved !!!
 */
public class JavaConfigSimpleExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);

        renderer.render();
    }
}
