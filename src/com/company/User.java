package com.company;

public class User {
    private String name;
    private int moviesSeen;
    private int bucketMovies; // Movies on bucket list to watch

    public User(String name, int moviesSeen, int bucketMovies) {
        this.name = name;
        this.moviesSeen = moviesSeen;
        this.bucketMovies = bucketMovies;
    }
}
