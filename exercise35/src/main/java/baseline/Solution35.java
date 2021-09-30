package baseline;

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
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Use a while loop.
        //Ask for the names of contestants until there is a blank answer.
        String name = getName();
        //Using a For Loop, Add these names into a ArrayList.
        //if name is left blank, end the while loop.
        //Call getWinner to determine the winner.
        String winner = getWinner();
        //Display the winner.
        String display = displayWinner();
    }
    private static String getName() {
        //take in one parameter: the prompt.
        //print out the prompt.
        //return the user input.
        return "";
    }
    private static String getWinner() {
        //take in one parameter: the ArrayList of Names.
        //use a random number generator to determine who wins.
        return "";
    }
    private static String displayWinner(){
        //take in one parameter: the name of the winner.
        //return the output string displaying who won.
        return "";
    }
}
