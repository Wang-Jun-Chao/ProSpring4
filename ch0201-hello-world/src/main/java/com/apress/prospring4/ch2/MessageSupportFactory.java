package com.apress.prospring4.ch2;

import java.io.InputStream;
import java.util.Properties;

/**
 * Author: 王俊超
 * Date: 2015-10-31
 * Time: 13:59
 * Declaration: All Rights Reserved !!!
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    static {
        instance = new MessageSupportFactory();
    }

    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory() {
        props = new Properties();

        try {
            InputStream inputStream = MessageSupportFactory.class
                    .getResourceAsStream("/com/apress/prospring4/ch2/msf.properties");
            props.load(inputStream);

            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
