package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Given the following data set, create a program
// that sorts all employees by last name and prints them to the screen in a tabular format.
//Store the data using a list of maps.
public class Solution39 {
    private static Solution39 app = new Solution39();
    private static Map<String, ArrayList<String>> firstMap = new HashMap<>();
    public static void main(String[] args) {
        //Create arrays for each entry. Include in each array:
        // the first name, the position, and the separation date.
        ArrayList<String> entry1 = new ArrayList<>();
        ArrayList<String> entry2 = new ArrayList<>();
        ArrayList<String> entry3 = new ArrayList<>();
        ArrayList<String> entry4 = new ArrayList<>();
        ArrayList<String> entry5 = new ArrayList<>();
        ArrayList<String> entry6 = new ArrayList<>();
        //Put the last name of each entry as well as what list they belong to into the hashmap.
        //use a function called sortbyLastName to sort the entries by their last name.
        //display an organized table of each entry organized by last name.
        System.out.println("Name \t\t\t\t| Postion \t\t\t\t| Separation Date");
        System.out.println("---------------------------------------------------------------------------------------");
        app.sortbyLastName();
    }

    public void sortbyLastName() {
        //take in no parameters.
        //create a TreeMap called newMap. This map needs a string and an ArrayList of strings.
        TreeMap<String, ArrayList<String>> newMap = new TreeMap<>();
        //within newMap, put all the entries of map into treeMap.
        //using an enchanced for loop, print out each entry, organized by last name.
    }
}
