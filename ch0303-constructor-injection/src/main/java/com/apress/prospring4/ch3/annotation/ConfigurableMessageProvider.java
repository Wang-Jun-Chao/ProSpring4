package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    @Autowired
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
