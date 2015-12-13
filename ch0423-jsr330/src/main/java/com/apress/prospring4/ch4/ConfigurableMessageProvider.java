package com.apress.prospring4.ch4;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Author: 王俊超
 * Date: 2015-12-11
 * Time: 08:48
 * Declaration: All Rights Reserved !!!
 */
@Named("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider{
    private String message = "Default message";

    public ConfigurableMessageProvider() {
    }

    @Inject
    @Named("message")
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
