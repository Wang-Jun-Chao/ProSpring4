package com.apress.prospring4.ch9;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-21
 * Time: 14:48
 * Declaration: All Rights Reserved !!!
 */
public class TxDeclarativeSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/tx-declarative-app-context.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean("contactService",
                ContactService.class);

        List<Contact> contacts = contactService.findAll();

        contacts.forEach(System.out::println);

        Contact contact = contactService.findById(1L);
        contact.setFirstName("Peter");
        contactService.save(contact);
        System.out.println("Contact saved successfully: " + contact);
        System.out.println("Contact count: " + contactService.countAll());
    }
}
