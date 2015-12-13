package com.apress.prospring4.ch2;

/**
 * Author: 王俊超
 * Date: 2015-10-31
 * Time: 13:54
 * Declaration: All Rights Reserved !!!
 */
public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
