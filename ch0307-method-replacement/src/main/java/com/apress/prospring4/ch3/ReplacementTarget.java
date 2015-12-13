package com.apress.prospring4.ch3;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 10:28
 * Declaration: All Rights Reserved !!!
 */
public class ReplacementTarget {
    public String formatMessage(String msg) {
        return "<h1>" + msg + "</h1>";
    }

    public String formatMessage(Object msg) {
        return "<h1>" + msg + "</h1>";
    }
}
