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
        //Create lists for each entry.
        ArrayList<String> entry1 = new ArrayList<>();
        ArrayList<String> entry2 = new ArrayList<>();
        ArrayList<String> entry3 = new ArrayList<>();
        ArrayList<String> entry4 = new ArrayList<>();
        ArrayList<String> entry5 = new ArrayList<>();
        ArrayList<String> entry6 = new ArrayList<>();
        //Include in each array:
        // the first name, the position, and the separation date.
        entry1.add("John");
        entry1.add("Manager");
        entry1.add("2016-12-31");
        entry2.add("Tou");
        entry2.add("Software Engineer");
        entry2.add("2016-12-31");
        entry3.add("Michaela");
        entry3.add("District Manager");
        entry3.add("2015-12-19");
        entry4.add("Jake");
        entry4.add("Programmer");
        entry4.add("");
        entry5.add("Jacquelyn");
        entry5.add("DBA");
        entry5.add("");
        entry6.add("Sally");
        entry6.add("Web Developer");
        entry6.add("2015-12-18");
        //Put the last name of each entry as well as what list they belong to into the hashmap.
        firstMap.put("Johnson", entry1);
        firstMap.put("Xiong", entry2);
        firstMap.put("Michaelson", entry3);
        firstMap.put("Jacobson", entry4);
        firstMap.put("Jackson", entry5);
        firstMap.put("Webber", entry6);
        //use a function called sortbyLastName to sort the entries by their last name.
        //display an organized table of each entry organized by last name.
        System.out.println("Name \t\t\t\t| Position \t\t\t\t| Separation Date");
        System.out.println("--------------------|-----------------------|----------------");
        app.sortbyLastName();
    }

    public void sortbyLastName() {
        //take in no parameters.
        //create a TreeMap called newMap. This map needs a string and an ArrayList of strings.
        TreeMap<String, ArrayList<String>> newMap = new TreeMap<>();
        //within newMap, put all the entries of map into treeMap.
        newMap.putAll(firstMap);
        //using an enchanced for loop, print out each entry, organized by last name.
        for(Map.Entry<String, ArrayList<String>> value : newMap.entrySet()){
            ArrayList <String> temp = value.getValue();
            System.out.format("%s %s\t| %s\t\t\t\t\t|\t\t%s", temp.get(0), value.getKey(),
                    temp.get(1), temp.get(2));
            System.out.println();
        }
    }
}
