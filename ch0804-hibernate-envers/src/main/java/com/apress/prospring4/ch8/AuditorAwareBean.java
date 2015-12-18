package com.apress.prospring4.ch8;

import org.springframework.data.domain.AuditorAware;

/**
 * Author: 王俊超
 * Date: 2015-12-18
 * Time: 14:41
 * Declaration: All Rights Reserved !!!
 */
public class AuditorAwareBean implements AuditorAware<String> {
    public String getCurrentAuditor() {
        return "prospring4";
    }
}
