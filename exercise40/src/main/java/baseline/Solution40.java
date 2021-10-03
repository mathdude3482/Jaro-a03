package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Given the following data set create a program that lets a user locate all records that
// match the search string by comparing the search string to the first or last name field.
//Store the data using a list of maps.
public class Solution40 {
    // Create two hashmaps: one for the first name and one for the last name.
    private static Solution40 app = new Solution40();
    private static Map<String, ArrayList<String>> firstNameMap = new HashMap<>();
    private static Map<String, ArrayList<String>> lastNameMap = new HashMap<>();
    public static void main(String[] args){
        //Create lists for each entry.
        //Include in each list: the position and the date of separation.
        //Store the first name and the last name into their respective hashmaps.
        //Call a function getString which asks for a search String.
        String search = app.getString();
        //call a function findName which will find a name that contains the search String.
        app.findName();
        //call a function display to display the output.
        System.out.println("Name \t\t\t\t| Position \t\t\t\t| Separation Date");
        System.out.println("--------------------|-----------------------|----------------");
        app.display();
    }

    private void display() {
        //take in no parameters.
        //based on the search string, print out the name of anyone who contains the string
        //along with their respective data.
    }

    private void findName() {
        //take in 1 parameter: the user input.
        //based on the user input, find the names containing that string within the hashMap.
    }

    //take in one parameter: the prompt.
    private String getString() {
        //print out the prompt.
        //return user input.
        return "";
    }

}
