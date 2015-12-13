package com.apress.prospring4.ch2;

/**
 * Author: 王俊超
 * Date: 2015-10-31
 * Time: 13:41
 * Declaration: All Rights Reserved !!!
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World";
    }
}
