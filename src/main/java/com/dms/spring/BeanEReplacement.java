package com.dms.spring;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class BeanEReplacement implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) {
        System.out.println("New method");
        return o;
    }
}
