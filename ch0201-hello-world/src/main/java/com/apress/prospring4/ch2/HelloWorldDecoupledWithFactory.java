package com.apress.prospring4.ch2;

/**
 * Author: 王俊超
 * Date: 2015-10-31
 * Time: 14:03
 * Declaration: All Rights Reserved !!!
 */
public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
