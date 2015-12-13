package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 08:01
 * Declaration: All Rights Reserved !!!
 */
public class BeanNamePrinterExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        BeanNamePrinter bean = (BeanNamePrinter) ctx.getBean("beanNamePrinter");
        bean.someOperation();
    }
}
