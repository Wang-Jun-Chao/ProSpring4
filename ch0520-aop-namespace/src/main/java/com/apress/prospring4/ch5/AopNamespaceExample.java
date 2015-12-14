package com.apress.prospring4.ch5;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 19:40
 * Declaration: All Rights Reserved !!!
 */
public class AopNamespaceExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        MyBean myBean = (MyBean) ctx.getBean("myBean");
        myBean.execute();
    }
}
