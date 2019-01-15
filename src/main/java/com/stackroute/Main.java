package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static final String MOVIE_BEAN_ID = "movieA";
    private static final String BEANS_XML = "beans.xml";

    public static void main(String[] args) {
        // Using BeanFactory
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(BEANS_XML));
        Movie firstMovie = (Movie) beanFactory.getBean(MOVIE_BEAN_ID);
        firstMovie.log();

        // Using BeanDefination Registry and BeanDefination Reader

        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource(BEANS_XML));

        Movie secondMovie = (Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean(MOVIE_BEAN_ID);
        secondMovie.log();

        // Using Application Context

        ApplicationContext context = new ClassPathXmlApplicationContext(BEANS_XML);

        Movie movie = (Movie) context.getBean(MOVIE_BEAN_ID);

        movie.log();

    }
}
