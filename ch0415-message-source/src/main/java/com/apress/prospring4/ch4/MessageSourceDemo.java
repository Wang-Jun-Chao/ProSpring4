package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Locale;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 09:46
 * Declaration: All Rights Reserved !!!
 */
public class MessageSourceDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        Locale english = Locale.ENGLISH;
        Locale czech = new Locale("cs", "CZ");

        System.out.println(ctx.getMessage("msg", null, english));
        System.out.println(ctx.getMessage("msg", null, czech));

        System.out.println(ctx.getMessage("nameMsg", new Object[]{"Chris", "Schaefer"}, english));
    }
}
