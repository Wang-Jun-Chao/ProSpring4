package com.apress.prospring4.ch3;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 09:38
 * Declaration: All Rights Reserved !!!
 */
public class StandardLookupDemoBean implements DemoBean {
    private MyHelper myHelper;

    public void setMyHelper(MyHelper myHelper) {
        this.myHelper = myHelper;
    }

    @Override
    public MyHelper getMyHelper() {
        return this.myHelper;
    }

    @Override
    public void someOperation() {
        myHelper.doSomethingHelpful();
    }
}
