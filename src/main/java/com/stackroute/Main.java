package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final String MOVIE_BEAN_A = "movieA";
    private static final String MOVIE_BEAN_B = "movieB";
    private static final String BEANS_XML = "beans.xml";

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(BEANS_XML);

        Movie movieOne = (Movie) context.getBean(MOVIE_BEAN_A);
        Movie movieTwo = (Movie) context.getBean(MOVIE_BEAN_A);

        movieOne.log();

        System.out.println(movieOne == movieTwo);

        Movie movieThree = (Movie) context.getBean(MOVIE_BEAN_B);
        Movie movieFour = (Movie) context.getBean(MOVIE_BEAN_B);

        System.out.println(movieThree == movieFour);

        Movie sampleMovieOne = (Movie) context.getBean("sampleMovie");
        sampleMovieOne.log();

        Movie sampleMovieTwo = (Movie) context.getBean("movieC");
        sampleMovieTwo.log();
    }
}
