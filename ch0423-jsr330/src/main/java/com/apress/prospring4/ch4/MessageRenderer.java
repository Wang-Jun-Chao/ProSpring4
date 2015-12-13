package com.apress.prospring4.ch4;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 08:47
 * Declaration: All Rights Reserved !!!
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
