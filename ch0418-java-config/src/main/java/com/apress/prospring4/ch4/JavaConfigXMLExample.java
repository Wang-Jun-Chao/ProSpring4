package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 15:57
 * Declaration: All Rights Reserved !!!
 */
public class JavaConfigXMLExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/spring/app-context-xml.xml");

        MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);

        renderer.render();
    }
}
