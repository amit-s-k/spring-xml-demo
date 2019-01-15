package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public Movie() {

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void log() {
        System.out.println("Movie begins in 3 2 1 ...");
    }

    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
