package com.apress.prospring4.ch5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 19:54
 * Declaration: All Rights Reserved !!!
 */
@Component("myBean")
public class MyBean {
    private MyDependency myDependency;

    public void execute() {
        myDependency.foo(100);
        myDependency.foo(101);
        myDependency.bar();
    }

    @Autowired
    public void setDep(MyDependency myDependency) {
        this.myDependency = myDependency;
    }
}
