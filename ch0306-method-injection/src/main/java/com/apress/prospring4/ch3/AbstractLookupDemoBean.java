package com.apress.prospring4.ch3;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 09:29
 * Declaration: All Rights Reserved !!!
 */
public abstract class AbstractLookupDemoBean implements DemoBean {


    public abstract MyHelper getMyHelper();

    @Override
    public void someOperation() {
        getMyHelper().doSomethingHelpful();
    }
}
