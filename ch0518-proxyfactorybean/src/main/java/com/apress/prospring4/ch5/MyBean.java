package com.apress.prospring4.ch5;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 18:55
 * Declaration: All Rights Reserved !!!
 */
public class MyBean {
    private MyDependency dep;

    public void execute() {
        dep.foo();
        dep.bar();
    }

    public void setDep(MyDependency dep) {
        this.dep = dep;
    }
}
