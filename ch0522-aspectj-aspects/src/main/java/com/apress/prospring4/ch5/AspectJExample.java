package com.apress.prospring4.ch5;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 20:01
 * Declaration: All Rights Reserved !!!
 */
public class AspectJExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load(new String[]{"classpath:META-INF/spring/app-context-xml.xml"});
        ctx.refresh();

        MessageWriter writer = new MessageWriter();
        writer.writeMessage();
        writer.foo();
    }
}
