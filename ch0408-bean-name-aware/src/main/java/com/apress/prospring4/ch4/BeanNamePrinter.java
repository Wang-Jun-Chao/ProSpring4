package com.apress.prospring4.ch4;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 08:00
 * Declaration: All Rights Reserved !!!
 */
public class BeanNamePrinter implements BeanNameAware {
    private String beanName;
    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void someOperation() {
        System.out.println("Bean [" + beanName + "] - someOperation()");
    }
}
