package com.apress.prospring4.ch4;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 15:50
 * Declaration: All Rights Reserved !!!
 */
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:"
                    + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
