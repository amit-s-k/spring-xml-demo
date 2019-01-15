package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final String MOVIE_BEAN_ID = "movieA";
    private static final String BEANS_XML = "beans.xml";

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(BEANS_XML);

        Movie movie = (Movie) context.getBean(MOVIE_BEAN_ID);

        movie.log();
    }
}
