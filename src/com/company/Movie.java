package com.company;
import java.util.*;
public class Movie {
    private String movieName;
    private int releaseYear;
    private String[] categories;
    private String[] actors;
    private String director;
    private float movieTime;

    public Movie(){
        this.movieName = null;
        this.releaseYear = 0;
        this.categories = null;
        this.actors = null;
        this.director = null;
        this.movieTime = 0;
    }

    public Movie(String mName, int rYear, String[] cat, String[] act, String dir, float time){
        this.movieName = new String(mName);
        this.releaseYear = rYear;
        for(int i = 0; i < cat.length; i++){
            if(cat[i] != null){
                this.categories[i] = new String(cat[i]);
            }
        }
//        this.categories = cat;
//        this.actors = act;
        for(int i = 0; i < act.length; i++){
            if(act[i] != null){
                this.actors[i] = new String(act[i]);
            }
        }
        this.director = new String(dir);
        this.movieTime = time;
    }

    public Movie searchMovie(String movie){
        if(movie == this.movieName){
            return this;
        }
        return null;
    }
    public void display(){
        System.out.println("Movie Name: " + this.movieName);
        System.out.println("Year: " + this.releaseYear);
        System.out.println("Categories: ");
        for(int i = 0; i < this.categories.length; i++){
            if(this.categories[i] != null) {
                System.out.println("#" + i + " " + this.categories[i]);
            }
        }
        System.out.println("Actors:");
        for(int i = 0; i < this.actors.length; i++){
            if(this.actors[i] != null){
                System.out.println("#" + i + " " + this.actors[i]);
            }
        }
        System.out.println("Director: " + this.director);
        System.out.println("Length:" + this.movieTime);
    }


}
