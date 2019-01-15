package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {

     public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
         System.out.println("Inside postProcessBeforeInitialization");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Inside postProcessAfterInitialization");
        return bean;
    }
}
