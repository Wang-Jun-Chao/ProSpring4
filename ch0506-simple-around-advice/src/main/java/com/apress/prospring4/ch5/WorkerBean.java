package com.apress.prospring4.ch5;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 14:29
 * Declaration: All Rights Reserved !!!
 */
public class WorkerBean {
    public void doSomeWork(int noOfTimes) {
        for(int x = 0; x < noOfTimes; x++) {
            work();
        }
    }

    private void work() {
        System.out.print("");
    }
}
