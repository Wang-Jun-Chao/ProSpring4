package com.apress.prospring4.ch8;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-18
 * Time: 15:17
 * Declaration: All Rights Reserved !!!
 */
public class SpringJPASample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean(
                "jpaContactService", ContactService.class);

        List<Contact> contacts = contactService.findAllByNativeQuery();

        contacts.forEach(System.out::println);
    }
}
