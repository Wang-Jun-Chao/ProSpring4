package com.apress.prospring4.ch5;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * Author: 王俊超
 * Date: 2015-12-13
 * Time: 14:51
 * Declaration: All Rights Reserved !!!
 */
public class SimpleStaticPointcut  extends StaticMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return "foo".equals(method.getName());
    }

    @Override
    public ClassFilter getClassFilter() {

        // lambda: return clazz -> clazz == BeanOne.class;
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                return clazz == BeanOne.class;
            }
        };
    }
}
