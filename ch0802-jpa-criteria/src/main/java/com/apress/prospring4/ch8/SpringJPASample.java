package com.apress.prospring4.ch8;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-17
 * Time: 14:51
 * Declaration: All Rights Reserved !!!
 */
public class SpringJPASample {

    private static void listContactsWithDetail(List<Contact> contacts) {
        System.out.println("");
        System.out.println("Listing contacts with details:");

        for (Contact contact: contacts) {
            System.out.println(contact);
            if (contact.getContactTelDetails() != null) {
                contact.getContactTelDetails().forEach(System.out::println);
            }

            if (contact.getHobbies() != null) {
                contact.getHobbies().forEach(System.out::println);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean(
                "jpaContactService", ContactService.class);

        List<Contact> contacts = contactService.findByCriteriaQuery("John", "Smith");
        listContactsWithDetail(contacts);
    }


}
