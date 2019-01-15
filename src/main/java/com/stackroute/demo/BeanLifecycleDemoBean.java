package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("Inside destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet");
    }
    public void customDestroy() throws Exception {
        System.out.println("Inside custom destroy");
    }

    public void customInit() throws Exception {
        System.out.println("Inside custom Init");
    }
}
