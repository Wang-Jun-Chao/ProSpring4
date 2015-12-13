package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 09:38
 * Declaration: All Rights Reserved !!!
 */
public class LookupDemo {
    public static void displayInfo(DemoBean bean) {
        MyHelper helper1 = bean.getMyHelper();
        MyHelper helper2 = bean.getMyHelper();

        System.out.println(bean.getClass().getName());

        System.out.println("Helper Instances the Same?: " + (helper1 == helper2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookup");


        for (int x = 0; x < 100000; x++) {
            MyHelper helper = bean.getMyHelper();
            helper.doSomethingHelpful();
        }

        stopWatch.stop();
        System.out.println("100000 gets took " + stopWatch.getTotalTimeMillis() + " ms");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        DemoBean abstractBean = (DemoBean) ctx.getBean("abstractLookupBean");
        DemoBean standardBean = (DemoBean) ctx.getBean("standardLookupBean");

        displayInfo(standardBean);
        displayInfo(abstractBean);
    }
}
