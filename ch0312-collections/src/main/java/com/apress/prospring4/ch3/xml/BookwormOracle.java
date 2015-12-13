package com.apress.prospring4.ch3.xml;

import com.apress.prospring4.ch3.Oracle;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 11:19
 * Declaration: All Rights Reserved !!!
 */
public class BookwormOracle implements Oracle {
    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use the Internet";
    }
}

