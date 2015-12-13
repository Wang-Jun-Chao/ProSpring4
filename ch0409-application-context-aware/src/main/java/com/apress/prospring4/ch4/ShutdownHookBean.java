package com.apress.prospring4.ch4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 08:10
 * Declaration: All Rights Reserved !!!
 */
public class ShutdownHookBean implements ApplicationContextAware {
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        if (ctx instanceof GenericApplicationContext) {
            ((GenericApplicationContext) ctx).registerShutdownHook();
        }
    }
}
