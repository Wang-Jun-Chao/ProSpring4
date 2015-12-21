package com.apress.prospring4.ch9;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-18
 * Time: 16:05
 * Declaration: All Rights Reserved !!!
 */
public class TxProgrammaticSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/tx-programmatic-app-context.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean("contactService", ContactService.class);

        System.out.println("Contact count: " + contactService.countAll());
    }
}
