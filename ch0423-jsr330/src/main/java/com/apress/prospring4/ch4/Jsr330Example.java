package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 08:51
 * Declaration: All Rights Reserved !!!
 */
public class Jsr330Example {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();
    }
}
