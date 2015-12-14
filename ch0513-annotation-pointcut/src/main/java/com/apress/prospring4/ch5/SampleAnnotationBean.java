package com.apress.prospring4.ch5;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 16:15
 * Declaration: All Rights Reserved !!!
 */
public class SampleAnnotationBean {
    @AdviceRequired
    public void foo(int x) {
        System.out.println("Invoked foo() with: "  +x);
    }

    public void bar() {
        System.out.println("Invoked bar()");
    }
}
