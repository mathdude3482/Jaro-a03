package baseline;

import java.util.ArrayList;
import java.util.List;
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
    private static List <String> name = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Solution34 app = new Solution34();
        //add names to the ArrayList.
        name.add(0,"John Smith");
        name.add(1,"Jackie Jackson");
        name.add(2,"Chris Jones");
        name.add(3,"Amanda Cullen");
        name.add(4,"Jeremy Goodwin");
        //Call a getSize method that will get the size of the list.
        int size = app.getSize(name);
        //Print out the initial list, with each name on its own line. Use a for loop here.
        System.out.println("There are " + size + " names:");
        for(int i = 0; i < size; i++)
            System.out.println((name.get(i)));
        //empty print statements to match the format of the output.
        System.out.println();
        //call a removeName method that will remove a name from the list.
        String remove = app.takeOutName("Enter an employee name to remove:");
        System.out.println();
        //declare a new list called newlist that will be used to store the new list of names
        // after removal of a name.
        List<String> newlist = app.removeName(name, remove);
        //get the size of newList.
        int newsize = app.getSize(newlist);
        if(newsize == size)
        {
            //if the size is the same, do not print out the list again.
            System.out.println("No changes have been made. The list is the same as before.");
        }
        else
        {
            //Print out the newList, with each name on its own line. Use a for loop here.
            System.out.println("There are " + newsize + " names:");
            for (int i = 0; i < newsize; i++)
                {
                System.out.println(newlist.get(i));
                }
        }
    }
    public int getSize(List<String> names) {
        //take in one parameter: the list of names.
        //return the size of the array.
        return names.size();
    }
    private String takeOutName(String prompt) {
        //take in one parameter: the prompt.
        //print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextLine();
    }
    //take in two parameters: the list of names and the name the user wants removed.
    public List<String> removeName(List<String> names, String removeName) {
        //remove any whitespace from the user input.
        String newremoveName = removeName.replaceAll("\\s", "");
        //if the name exists, remove the name from the arrayList.
        for (int i = 0; i < names.size(); i++){
            //remove whitespace from each name in the arrayList.
            String newName = names.get(i).replaceAll("\\s", "");
            if (newName.equalsIgnoreCase(newremoveName))
            {
                names.remove(removeName);
                return names;
            }
        }
        //otherwise, keep the list as it was before.
        //return the array.
        return names;
    }
}
