package com.apress.prospring4.ch2;

/**
 * Author: 王俊超
 * Date: 2015-10-31
 * Time: 13:14
 * Declaration: All Rights Reserved !!!
 */
public class HelloWorldWithCommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World!");
        }
    }
}
