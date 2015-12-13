package com.apress.prospring4.ch4;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 08:50
 * Declaration: All Rights Reserved !!!
 */
@Named("messageRenderer")
@Singleton
public class StandardOutMessageRenderer implements MessageRenderer {
    @Inject
    @Named("messageProvider")
    private MessageProvider messageProvider = null;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:"
                    + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
