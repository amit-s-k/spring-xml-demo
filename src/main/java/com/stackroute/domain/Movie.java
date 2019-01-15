package com.stackroute.domain;

public class Movie {
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
}
