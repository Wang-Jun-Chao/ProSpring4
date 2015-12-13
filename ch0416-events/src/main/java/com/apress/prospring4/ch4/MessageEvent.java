package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationEvent;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 15:15
 * Declaration: All Rights Reserved !!!
 */
public class MessageEvent extends ApplicationEvent {
    private String msg;

    public MessageEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
