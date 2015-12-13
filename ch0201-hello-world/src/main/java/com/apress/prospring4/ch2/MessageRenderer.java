package com.apress.prospring4.ch2;

/**
 * Author: 王俊超
 * Date: 2015-10-31
 * Time: 13:40
 * Declaration: All Rights Reserved !!!
 */
public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
