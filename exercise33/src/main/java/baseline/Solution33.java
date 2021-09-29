package baseline;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a Magic 8 Ball game that prompts for a question
// and then displays either Yes, No, Maybe, or Ask again later.
//The value should be chosen randomly using a pseudo random number generator.
//Store the possible choices in a list and select one at random.
public class Solution33 {
    public static final Scanner in = new Scanner(System.in);
    private static String question;
    private static String result;
    public static void main(String[] args) {
        //Prompt the user for a question.
        question = askQuestion();
        //Call a displayAnswer method that will display one of the 4 answers (specified above) at random.
        result = displayAnswer();
    }
    private static String askQuestion() {
        //take in one parameter: the prompt.
        //print out the prompt.
        //return the user input.
        return "";
    }
    private static String displayAnswer() {
        //take in no parameters.
        //Store the four possible answers into an ArrayList.
        ArrayList<String> choice = new ArrayList<>();
        //using Math.rand, return one of the four choices.
        return "";
    }
}
