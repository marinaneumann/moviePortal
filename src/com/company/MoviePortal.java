package com.company;
import java.util.*;

public class MoviePortal {
    public static void main(String[] args) {
        // write your code here
        List<Movie> Portal = new ArrayList<Movie>();
//        System.out.println("What?");
        List<String>test = new ArrayList<String>();
//        test.add("blah");
//        test.add("whatever");
//        test.add("ok");
//
//        Portal.add(m);
        //Movie see = Portal.get(0);
        //see.display();
        //menu();
//        displayMovies(Portal);
    }

    public static void menu(List Portal){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'a' to add a new movie to the database");
        System.out.println("Enter 'd' to display a movie in the database");
        System.out.println("Enter 's' to search the portal for a movie:");
        System.out.println("Enter 'e' to exit this program");
        String choice = in.next();
        if(choice == "a"){
            addMovie();
        }else if (choice == "d"){
            displayMovies(Portal);
        }else if (choice == "s"){
            //search();
        };
    }
    public static void addMovie(){
        String movieN;
        int rYear;
        String director;
        String[] cat = new String[5];
        String[] actors = new String[10];
        float time;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of Movie:");
        movieN = in.next();

        System.out.println("Enter the year movie released:");
        rYear = in.nextInt();

        System.out.println("Enter the movie director:");
        director = in.next();

        String catChoice = "yes";
        for(int i = 0; i < cat.length; i++) {
            if(catChoice == "yes") {
                System.out.println("What film category? (Romance, Action, Adventure, Comedy, Fantasy, Sci-fi, etc");
                cat[i] = in.next();
                System.out.println("Add another film category?Enter yes or no");
                catChoice = in.next();
                catChoice = catChoice.toLowerCase();
            }else{
                break;
            }
        }

        String actChoice = "yes";
        for(int z = 0; z < actors.length; z++){
            if (actChoice == "yes"){
                System.out.println("Add an actor/actress");
                actors[z] = in.next();
                System.out.println("Add another actor/actress? yes or no?");
                actChoice = in.next();
                actChoice = actChoice.toLowerCase();
            }else{
                break;
            }
        }
        System.out.println("Enter movie length:");
        time = in.nextFloat();

    }

    public static void displayMovies(List Portal){
        for(int i =0; i < Portal.size(); i++){
            System.out.println("#"+ i);
            Movie thing = (Movie) Portal.get(i);
            thing.display();
        }
    }

}
