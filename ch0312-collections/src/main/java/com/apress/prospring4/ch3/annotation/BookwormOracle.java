package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.Oracle;
import org.springframework.stereotype.Service;

/**
 * Author: 王俊超
 * Date: 2015-12-08
 * Time: 11:15
 * Declaration: All Rights Reserved !!!
 */
@Service("oracle")
public class BookwormOracle implements Oracle {

    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use the Internet";
    }
}
