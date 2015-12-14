package com.apress.prospring4.ch5;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 16:36
 * Declaration: All Rights Reserved !!!
 */
public class TestPointcut extends StaticMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class cls) {
        return ("advised".equals(method.getName()));
    }
}
