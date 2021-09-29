package baseline;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a small program that contains a list of employee names.
//Print out the list of names when the program runs the first time.
//Prompt for an employee name and remove that specific name from the list of names.
//Display the remaining employees, each on its own line.
//Use an array or list to store the names.
public class Solution34 {
    //Create an ArrayList that contains a list of names.
    private static ArrayList <String> name = new ArrayList<>();
    public static void main(String[] args) {
        //add names to the ArrayList.
        name.add("");
        //Call a getSize method that will get the size of the list.
        int size = getSize();
        //Print out the initial list, with each name on its own line. Use a for loop here.
        System.out.println(displayName());
        //call a removeName method that will remove a name from the list.
        ArrayList<String> newlist = new ArrayList<>();
        newlist = removeName(name);
        //Print out the revised list, with each name on its own line. Use a for loop here.
        System.out.println(displayName());
    }
    private static String displayName() {
        //take in one parameter: the ArrayList.
        //print out the names.
        return "";
    }

    private static int getSize() {
        //take in one parameter: the list of names.
        //return the size of the array.
        return 0;
    }

    private static ArrayList<String> removeName(ArrayList<String> names) {
        //take in one parameter: the list of names.
        //remove an element from the array.
        //return the array.
        return names;
    }

}
