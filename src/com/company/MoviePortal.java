package com.company;
import java.util.*;

public class MoviePortal {
    public static void main(String[] args) {
        // write your code here
        List<Movie> Portal = new ArrayList<Movie>();
//        System.out.println("What?");
        //Movie m = new Movie();
        //Portal.add(m);
        //Movie see = Portal.get(0);
        //see.display();
        //menu();
    }

    public static void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'a' to add a new movie to the database");
        System.out.println("Enter 'd' to display a movie in the database");
        System.out.println("Enter 's' to search the portal for a movie:");
        System.out.println("Enter 'e' to exit this program");
        String choice = in.next();
        if(choice == "a"){
            //add();
        }else if (choice == "d"){
            //display();
        }else if (choice == "s"){
            //search();
        };
    }


}
