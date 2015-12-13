package com.apress.prospring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 08:37
 * Declaration: All Rights Reserved !!!
 */
@Service("injectSimple")
public class InjectSimple {
    @Value("Chris Schaefer")
    private String name;

    @Value("32")
    private int age;

    @Value("1.778")
    private float height;

    @Value("true")
    private boolean programmer;

    @Value("1009843200")
    private Long ageInSeconds;

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is Programmer?: " + programmer;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
        System.out.println(simple);
    }
}
