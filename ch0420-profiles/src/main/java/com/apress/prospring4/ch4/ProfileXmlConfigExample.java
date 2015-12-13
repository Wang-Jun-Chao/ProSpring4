package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 17:29
 * Declaration: All Rights Reserved !!!
 */
public class ProfileXmlConfigExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/*-config.xml");
        ctx.refresh();

        FoodProviderService foodProviderService = ctx.getBean("foodProviderService", FoodProviderService.class);

        List<Food> lunchSet = foodProviderService.provideLunchSet();

        for (Food food : lunchSet) {
            System.out.println("Food: " + food.getName());
        }
    }
}
