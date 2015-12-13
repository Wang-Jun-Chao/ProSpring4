package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.security.MessageDigest;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 08:47
 * Declaration: All Rights Reserved !!!
 */
public class AccessingFactoryBeans {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        MessageDigest digest = (MessageDigest) ctx.getBean("shaDigest");

        MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean) ctx.getBean("&shaDigest");

        try {
            MessageDigest shaDigest = factoryBean.getObject();
            System.out.println(shaDigest.digest("Hello world".getBytes()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
