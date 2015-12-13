package com.apress.prospring4.ch3.annotation;

import org.springframework.stereotype.Component;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 08:41
 * Declaration: All Rights Reserved !!!
 */
@Component("injectSimpleConfig")
public class InjectSimpleConfig {
    private String name = "Chris Schaefer";
    private int age = 32;
    private float height = 1.778f;
    private boolean programmer = true;
    private Long ageInSeconds = 1009843200L;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }
}
