package com.apress.prospring4.ch5;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 16:35
 * Declaration: All Rights Reserved !!!
 */
public class DefaultSimpleBean implements SimpleBean {
    private long dummy = 0;

    @Override
    public void advised() {
        dummy = System.currentTimeMillis();
    }

    @Override
    public void unadvised() {
        dummy = System.currentTimeMillis();
    }
}
