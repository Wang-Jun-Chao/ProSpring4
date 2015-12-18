package com.apress.prospring4.ch8;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-18
 * Time: 14:47
 * Declaration: All Rights Reserved !!!
 */
public class SpringJPASample {
    private static void listContacts(List<ContactAudit> contacts) {
        System.out.println("");
        System.out.println("Listing contacts without details:");
        for (ContactAudit contact: contacts) {
            System.out.println(contact);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        ContactAuditService contactService = ctx.getBean(
                "contactAuditService", ContactAuditService.class);

        System.out.println("Add new contact");
        ContactAudit contact = new ContactAudit();
        contact.setFirstName("Michael");
        contact.setLastName("Jackson");
        contact.setBirthDate(new Date());
        contactService.save(contact);
        listContacts(contactService.findAll());

        System.out.println("Update contact");
        contact.setFirstName("Tom");
        contactService.save(contact);
        listContacts(contactService.findAll());

        ContactAudit oldContact = contactService.findAuditByRevision(1L, 1);
        System.out.println("");
        System.out.println("Old Contact with id 1 and rev 1:" + oldContact);
        System.out.println("");
        oldContact = contactService.findAuditByRevision(1L, 2);
        System.out.println("");
        System.out.println("Old Contact with id 1 and rev 2:" + oldContact);
        System.out.println("");
    }


}
