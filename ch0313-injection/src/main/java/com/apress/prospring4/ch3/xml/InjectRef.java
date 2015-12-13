package com.apress.prospring4.ch3.xml;

import com.apress.prospring4.ch3.Oracle;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 17:07
 * Declaration: All Rights Reserved !!!
 */
public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public String toString() {
        return oracle.defineMeaningOfLife();
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
        System.out.println(injectRef);
    }
}
