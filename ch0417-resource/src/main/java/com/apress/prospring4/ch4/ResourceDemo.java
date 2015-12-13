package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.File;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 15:32
 * Declaration: All Rights Reserved !!!
 */
public class ResourceDemo {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext();

        File file = File.createTempFile("test", "txt");
        file.deleteOnExit();

        System.out.println(file.getPath());
        Resource res1 = ctx.getResource("file://" + file.getPath());
        // 调用时会出错
        displayInfo(res1);

        Resource res2 = ctx.getResource("classpath:test.txt");
        displayInfo(res2);

        Resource res3 = ctx.getResource("http://www.google.com");
        displayInfo(res3);
    }

    private static void displayInfo(Resource res) throws Exception {
        System.out.println(res.getClass());
        System.out.println(res.getURL().getContent());
        System.out.println("");
    }
}
