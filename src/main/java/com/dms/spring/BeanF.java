package com.dms.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanF implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {
    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName(\"" + s + "\")");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext()");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet()");
    }

    public void init_custom() {
        System.out.println("init_custom()");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization(\"" + beanName + "\")");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization(\"" + beanName + "\")");
        return bean;
    }

    public void func() {
        System.out.println("func()");
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }

    public void destroy_custom() {
        System.out.println("destroy_custom()");
    }
}
