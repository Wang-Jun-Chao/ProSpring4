package com.apress.prospring4.ch4;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 15:49
 * Declaration: All Rights Reserved !!!
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
