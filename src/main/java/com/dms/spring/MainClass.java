package com.dms.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanF f = (BeanF) context.getBean("F");
        f.func();
        BeanE e = (BeanE) context.getBean("E");
        e.print();
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
