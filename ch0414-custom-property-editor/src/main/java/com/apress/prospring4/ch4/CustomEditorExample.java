package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 09:24
 * Declaration: All Rights Reserved !!!
 */
public class CustomEditorExample {
    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        CustomEditorExample bean = (CustomEditorExample) ctx.getBean("exampleBean");

        System.out.println(bean.getName());
    }
}
