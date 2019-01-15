package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;

    public Movie() {

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void log() {
        System.out.println(actor.toString());
    }

    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Movie movie = (Movie) beanFactory.getBean("movieA");
        movie.log();
    }

    public void setBeanName(String name) {
        System.out.println("Bean Name is " + name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Movie movie = (Movie) applicationContext.getBean("movieA");
        movie.log();
    }
}
