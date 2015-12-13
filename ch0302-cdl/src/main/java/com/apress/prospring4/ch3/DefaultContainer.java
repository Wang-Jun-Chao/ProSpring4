package com.apress.prospring4.ch3;

/**
 * Author: 王俊超
 * Date: 2015-11-09
 * Time: 10:11
 * Declaration: All Rights Reserved !!!
 */
public class DefaultContainer implements Container {
    @Override
    public Object getDependency(String key) {
        if ("myDependency".equals(key)) {
            return new Dependency();
        }

        throw new RuntimeException("Unknown dependency: " + key);
    }
}
