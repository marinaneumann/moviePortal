package com.company;
import java.util.*;
public class Movie {
    private String movieName;
    private int releaseYear;
    private String[] categories;
    private String[] actors;
    private String director;
    private float movieTime;
    private String[] sources;


    //To Do: Improve contstructors efficiency with constructor chaining??

    public Movie(){
        this.movieName = null;
        this.releaseYear = 0;
        this.categories = null;
        this.actors = null;
        this.director = null;
        this.movieTime = 0;
        this.sources = null;
    }
     public Movie(String mName){
        this.movieName = mName;
    }
    public Movie(String mName,int y){
        this.movieName = mName;
        this.releaseYear = y;
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
        if(movie.equals(this.movieName)){
            return this;
        }
        return null;
    }
    public Movie searchYear(int year){
        if(this.releaseYear == year){
            return this;
        }
        return null;
    }
    public Movie searchDirector(String dir){
        if(this.director.equals(dir)){
            return this;
        }
        return null;
    }
    public int searchActor(String act){
        for(int i = 0; i < actors.length; i++){
            if(act.equals(actors[i])){
                return 1;
            }
        }
        return 0; // Have not found this movie to have actor searched in this movie.
    }
    public int shorterMovieCheck(float time){
        if(this.movieTime < time){
            return 1;
        }
        return 0;
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
