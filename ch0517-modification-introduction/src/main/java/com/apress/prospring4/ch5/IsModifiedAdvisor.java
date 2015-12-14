package com.apress.prospring4.ch5;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 18:46
 * Declaration: All Rights Reserved !!!
 */
public class IsModifiedAdvisor extends DefaultIntroductionAdvisor {
    public IsModifiedAdvisor() {
        super(new IsModifiedMixin());
    }
}
