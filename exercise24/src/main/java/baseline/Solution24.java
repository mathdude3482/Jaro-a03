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
    public static void main(String[] args) {
        Solution24 app = new Solution24();
        //Declare two strings word1 and word2.
        String word1;
        String word2;
        //Ask the user to input data for word1.
        word1 = app.getWord();
        //Ask the user to input data for word2.
        word2 = app.getWord();
        //determine if the two words are anagrams.
        String result = app.isAnagram();
        //print out the result.
        System.out.println(result);
    }
    private String getWord() {
        //take in input prompt as a parameter.
        //print out the input prompt.
        //read in the word.
        //return the word as a string.
        return null;
    }
    private String isAnagram() {
        //take in two word strings as a parameter.
        //determine if the words are anagrams.
        //return the result.
        return null;
    }
}
