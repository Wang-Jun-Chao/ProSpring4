package com.apress.prospring4.ch4;

import java.security.MessageDigest;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 09:05
 * Declaration: All Rights Reserved !!!
 */
public class MessageDigestFactory {
    private String algorithmName = "MD5";

    public MessageDigest createInstance() throws Exception {
        return MessageDigest.getInstance(algorithmName);
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

}
