package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 09:05
 * Declaration: All Rights Reserved !!!
 */
public class MessageDigestFactoryExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        MessageDigester digester = (MessageDigester) ctx.getBean("digester");
        digester.digest("Hello World!");
    }
}
