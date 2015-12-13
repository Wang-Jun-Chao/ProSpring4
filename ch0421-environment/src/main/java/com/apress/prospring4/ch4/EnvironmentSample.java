package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 08:20
 * Declaration: All Rights Reserved !!!
 */
public class EnvironmentSample {
    public static void main(String[] args) {
        test01();
        System.out.println();
        test02();
    }

    public static void test01() {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.refresh();

        ConfigurableEnvironment env = ctx.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();
        Map appMap = new HashMap();
        appMap.put("application.home", "application_home");
        propertySources.addLast(new MapPropertySource("PROSPRING4_MAP", appMap));

        System.out.println("user.home: " + System.getProperty("user.home"));
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));

        System.out.println("user.home: " + env.getProperty("user.home"));
        System.out.println("JAVA_HOME: " + env.getProperty("JAVA_HOME"));
        System.out.println("application.home: " + env.getProperty("application.home"));
    }

    public static void test02() {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.refresh();

        ConfigurableEnvironment env = ctx.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();

        Map appMap = new HashMap();
        appMap.put("user.home", "application_home");

        propertySources.addFirst(new MapPropertySource("PROSPRING4_MAP", appMap));

        System.out.println("user.home: " + System.getProperty("user.home"));
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));

        System.out.println("user.home: " + env.getProperty("user.home"));
        System.out.println("JAVA_HOME: " + env.getProperty("JAVA_HOME"));
    }
}
