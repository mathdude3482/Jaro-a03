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
    public static void main(String[] args) {
        //Prompt the user for a question.
        String question = askQuestion("What is your question?");
        System.out.println(question);
        //Call a displayAnswer method that will display one of the 4 answers (specified above) at random.
        String result = displayAnswer();
        //print the result.
        System.out.println(result);
    }
    private static String askQuestion(String prompt) {
        //take in one parameter: the prompt.
        //print out the prompt.
        System.out.println(prompt);
        //return the user input.
        return "> " + in.nextLine();
    }
    private static String displayAnswer() {
        //take in no parameters.
        //Store the four possible answers into an ArrayList.
        ArrayList<String> choice = new ArrayList<>();
        choice.add(0,"Yes.");
        choice.add(1,"No.");
        choice.add(2,"Maybe.");
        choice.add(3,"Ask again later.");
        //use a random number generator to determine the index that should be returned.
        int max = 4;
        int min = 1;
        int range = max - min + 1;
        //using Math.rand, return one of the four choices.
        int rand = (int)(Math.random() * range);
        return choice.get(rand);
    }
}
