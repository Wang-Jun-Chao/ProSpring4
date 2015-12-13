package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 10:31
 * Declaration: All Rights Reserved !!!
 */
public class MethodReplacementExample {

    private static void displayInfo(ReplacementTarget target) {
        System.out.println(target.formatMessage("Hello World!"));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");

        for (int x = 0; x < 1000000; x++) {
            String out = target.formatMessage("foo");
        }

        stopWatch.stop();

        System.out.println("1000000 invocations took: " + stopWatch.getTotalTimeMillis() + " ms");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        ReplacementTarget replacementTarget = (ReplacementTarget) ctx.getBean("replacementTarget");
        ReplacementTarget standardTarget = (ReplacementTarget) ctx.getBean("standardTarget");

        displayInfo(replacementTarget);
        displayInfo(standardTarget);
    }
}
