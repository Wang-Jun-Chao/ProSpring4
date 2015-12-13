package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 08:33
 * Declaration: All Rights Reserved !!!
 */
public class PlaceHolderSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        AppProperty appProperty = ctx.getBean("appProperty", AppProperty.class);

        System.out.println("application.home: " + appProperty.getApplicationHome());
        System.out.println("user.home: " + appProperty.getUserHome());
    }
}
