package com.apress.prospring4.ch3;

/**
 * Author: 王俊超
 * Date: 2015-11-09
 * Time: 10:13
 * Declaration: All Rights Reserved !!!
 */
public class ContextualizedDependencyLookup implements ManagedComponent {
    private Dependency dependency;

    @Override
    public void performLookup(Container container) {
        this.dependency = (Dependency) container.getDependency("myDependency");
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
