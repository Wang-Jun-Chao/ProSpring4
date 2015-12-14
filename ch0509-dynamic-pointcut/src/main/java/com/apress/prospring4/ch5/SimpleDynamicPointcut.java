package com.apress.prospring4.ch5;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 15:04
 * Declaration: All Rights Reserved !!!
 */
public class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {
    @Override
    public boolean matches(Method method,  Class<?> cls) {
        System.out.println("Static check for " + method.getName());
        return ("foo".equals(method.getName()));
    }

    @Override
    public boolean matches(Method method, Class<?> cls, Object[] args) {
        System.out.println("Dynamic check for " + method.getName());

        int x = (Integer) args[0];

        return (x != 100);
    }

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            public boolean matches(Class<?> cls) {
                return (cls == SampleBean.class);
            }
        };
    }
}
