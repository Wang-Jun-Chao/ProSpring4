package com.apress.prospring4.ch5;

import org.springframework.stereotype.Component;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 19:52
 * Declaration: All Rights Reserved !!!
 */
@Component("myDependency")
public class MyDependency {
    public void foo(int intValue) {
        System.out.println("foo(int): " + intValue);
    }

    public void bar() {
        System.out.println("bar()");
    }
}
