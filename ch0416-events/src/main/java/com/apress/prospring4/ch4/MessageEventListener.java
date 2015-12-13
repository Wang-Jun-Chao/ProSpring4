package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 15:16
 * Declaration: All Rights Reserved !!!
 */
public class MessageEventListener implements ApplicationListener<MessageEvent> {
    @Override
    public void onApplicationEvent(MessageEvent event) {
        MessageEvent msgEvt = (MessageEvent) event;
        System.out.println("Received: " + msgEvt.getMessage());
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/spring/app-context-xml.xml");

        Publisher pub = (Publisher) ctx.getBean("publisher");
        pub.publish("Hello World!");
        pub.publish("The quick brown fox jumped over the lazy dog");
    }
}
