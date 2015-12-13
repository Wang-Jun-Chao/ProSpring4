package com.apress.prospring4.ch4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 16:11
 * Declaration: All Rights Reserved !!!
 */
@Configuration
@ImportResource(value = "classpath:META-INF/spring/app-context-xml.xml")
@PropertySource(value = "classpath:message.properties")
@ComponentScan(basePackages = {"com.apress.prospring4.ch4"})
@EnableTransactionManagement
public class AppConfig {
    @Autowired
    Environment env;

    @Bean
    @Lazy(value = true)
    public MessageProvider messageProvider() {
        return new ConfigurableMessageProvider(env.getProperty("message"));
    }

    @Bean(name = "messageRenderer")
    @Scope(value = "prototype")
    @DependsOn(value = "messageProvider")
    public MessageRenderer messageRenderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(messageProvider());

        return renderer;
    }
}