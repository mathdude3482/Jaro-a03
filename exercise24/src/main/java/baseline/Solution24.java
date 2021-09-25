package baseline;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that compares two strings and determines if the two strings are anagrams.
//The program should prompt for both input strings
//and display the output as shown in the example.
//Implement the program using a function called isAnagram,
// which takes in two words as its arguments and returns true or false.
public class Solution24 {
    private static final Scanner in = new Scanner(System.in);
    //Declare three strings: word1, word2, and the result.
    private String word1;
    private String word2;
    private String result;
    public static void main(String[] args) {
        Solution24 app = new Solution24();
        //Ask the user to input data for word1.
        app.word1 = app.getWord("Enter the first word:");
        //Ask the user to input data for word2.
        app.word2 = app.getWord("Enter the second word:");
        //determine if the two words are anagrams.
        String result = app.isAnagram(app.word1, app.word2);
        //print out the result.
        System.out.println(result);
    }
    //take in input prompt as a parameter.
    private String getWord(String prompt) {
        //print out the input prompt.
        System.out.println(prompt);
        //read the word and return the word as a string.
        return in.nextLine();
    }
    private String isAnagram(String word1, String word2) {
        //take in two word strings as a parameter.
        //determine if the words are anagrams.
        //return the result.
        return null;
    }
}
