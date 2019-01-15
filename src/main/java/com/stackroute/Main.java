package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final String BEANS_XML = "beans.xml";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(BEANS_XML);
    }
}
