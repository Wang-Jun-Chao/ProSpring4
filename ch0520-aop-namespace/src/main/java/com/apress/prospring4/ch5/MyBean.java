package com.apress.prospring4.ch5;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 19:40
 * Declaration: All Rights Reserved !!!
 */
public class MyBean {
    private MyDependency dep;

    public void execute() {
        dep.foo(100);
        dep.foo(101);
        dep.bar();
    }

    public void setDep(MyDependency dep) {
        this.dep = dep;
    }
}
