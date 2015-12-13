package com.apress.prospring4.ch4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 15:17
 * Declaration: All Rights Reserved !!!
 */
public class Publisher implements ApplicationContextAware {
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }

    public void publish(String message) {
        ctx.publishEvent(new MessageEvent(this, message));
    }

}
