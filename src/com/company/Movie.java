package com.company;
import java.util.Scanner;
public class Movie {
    private String movieName;
    private int releaseYear;
    private String[] categories;
    private String[] actors;
    private String director;
    private float movieTime;

    public Movie(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of Movie:");
        this.movieName = in.next();

        System.out.println("Enter the year movie released:");
        this.releaseYear = in.nextInt();

        System.out.println("Enter the movie director:");
        this.director = in.next();

    }


}
