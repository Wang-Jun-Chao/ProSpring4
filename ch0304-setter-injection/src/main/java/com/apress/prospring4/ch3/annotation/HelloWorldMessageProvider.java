package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.MessageProvider;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
