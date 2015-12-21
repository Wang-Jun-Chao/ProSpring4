package com.apress.prospring4.ch9;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-20
 * Time: 09:19
 * Declaration: All Rights Reserved !!!
 */
public class TxJtaSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/tx-jta-app-context.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean("contactService",
                ContactService.class);

        Contact contact = new Contact();
        contact.setFirstName("Jta");
        contact.setLastName("Manager");
        contactService.save(contact);
        System.out.println("Contact saved successfully");
    }
}
