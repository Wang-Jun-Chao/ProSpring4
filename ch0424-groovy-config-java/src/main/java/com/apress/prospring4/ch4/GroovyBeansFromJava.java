package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 08:55
 * Declaration: All Rights Reserved !!!
 */
public class GroovyBeansFromJava {
    public static void main(String[] args) {
        ApplicationContext context = new GenericGroovyApplicationContext("classpath:beans.groovy");
        Contact contact = context.getBean("contact", Contact.class);
        System.out.println(contact);
    }
}
