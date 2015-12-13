package com.apress.prospring4.ch3;

/**
 * Author: 王俊超
 * Date: 2015-11-09
 * Time: 10:03
 * Declaration: All Rights Reserved !!!
 */
public class CDLExample {
    public static void main(String[] args) {
        Container container = new DefaultContainer();

        ManagedComponent managedComponent = new ContextualizedDependencyLookup();
        managedComponent.performLookup(container);

        System.out.println(managedComponent);
    }
}
