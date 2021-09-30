package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that picks a winner for a contest or prize drawing.
// Prompt for names of contestants until the user leaves the entry blank.
// Then randomly select a winner.
//Use a loop to capture user input into an array.
//Use a random number generator to pluck a value from the array.
//Don’t include a blank entry in the array.
//Some languages require that you define the length of the array ahead of time.
// You may need to find another data structure, like an ArrayList.
public class Solution35 {
    private static final Scanner in = new Scanner(System.in);
    private static final Random rand = new Random();
    private static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {
        //Use a do-while loop.
        //Ask for the names of contestants until there is a blank answer.
        String name;
        do{
            name = getName("Enter a name: ");
            names.add(name);
        }while(!(name.equals("")));
        //remove the empty entry.
        names.remove("");
        //Call getWinner to determine the winner.
        String winner = getWinner(names);
        //Display the winner.
        String display = displayWinner(winner);
        System.out.println(display);
    }
    private static String getName(String prompt) {
        //take in one parameter: the prompt.
        //print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextLine();
    }
    private static String getWinner(ArrayList <String> names) {
        //take in one parameter: the ArrayList of Names.
        //use a random number generator to determine who wins.
        //return the winner.
        return names.get(chooseIndex(names));
    }
    public static int chooseIndex(List<String> names){
        //take in one parameter: the list of names.
        //set the range.
        int max = names.size();
        int min = 1;
        //return a random integer within the range.
        return rand.nextInt(max - min + 1);
    }
    private static String displayWinner(String winner){
        //take in one parameter: the name of the winner.
        //return the output string displaying who won.
        return "The winner is... " + winner + ".";
    }
}
