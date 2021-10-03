package baseline;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Given the following data set, create a program
// that sorts all employees by last name and prints them to the screen in a tabular format.
//Store the data using a list of maps.
public class Solution40 {
    private static Solution40 app = new Solution40();
    private static Map<String, ArrayList<String>> lastName = new HashMap<>();
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
        lastName.put("Johnson", entry1);
        lastName.put("Xiong", entry2);
        lastName.put("Michaelson", entry3);
        lastName.put("Jacobson", entry4);
        lastName.put("Jackson", entry5);
        lastName.put("Webber", entry6);
        //use a function called sortbyLastName to sort the entries by their last name.
        String search = app.getString("Enter a search string: ");
        //display an organized table of each entry organized by last name.
        System.out.println("Name \t\t\t\t| Position \t\t\t | Separation Date");
        System.out.println("--------------------|--------------------|----------------");
        app.sortbyName(search);
    }
    private String getString(String prompt){
        Scanner in = new Scanner(System.in);
        //print out the prompt.
        System.out.print(prompt);
        return in.nextLine();
    }
    public void sortbyName(String search) {
        //take in no parameters.
        //create a TreeMap called newMap. This map needs a string and an ArrayList of strings.
        TreeMap<String, ArrayList<String>> newMap = new TreeMap<>();
        //within newMap, put all the entries of map into treeMap.
        newMap.putAll(lastName);
        //using an enchanced for loop, print out each entry, organized by last name.
        for(Map.Entry<String, ArrayList<String>> value : newMap.entrySet()){
            ArrayList <String> temp = value.getValue();
            StringBuilder myString = new StringBuilder(temp.get(0)).append(" ").append(value.getKey());
            while(myString.length() < 20){
                myString.append(" ");
            }
            System.out.printf("%s| ", myString);
            myString = new StringBuilder(temp.get(1));
            while(myString.length() < 19){
                myString.append(" ");
            }
            System.out.printf("%s| ", myString);
            myString = new StringBuilder(temp.get(2));
            while(myString.length() < 19){
                myString.append(" ");
            }
            System.out.printf("%s %n", myString);
        }
    }
}