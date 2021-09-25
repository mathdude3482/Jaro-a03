package baseline;
import java.util.Arrays;
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
    //Declare three strings: word1, word2, and the output. Declare a boolean value as well.
    private String word1;
    private String word2;
    private boolean result;
    private String output;
    public static void main(String[] args) {
        Solution24 app = new Solution24();
        //Ask the user to input data for word1.
        app.word1 = app.getWord("Enter the first word:");
        //Ask the user to input data for word2.
        app.word2 = app.getWord("Enter the second word:");
        //determine if the two words are anagrams.
        app.result = app.isAnagram(app.word1, app.word2);
        //print out the result.
        app.output = app.displayOutput(app.word1, app.word2, app.result);
        System.out.println(app.output);
    }
    //take in the prompt as a parameter.
    private String getWord(String prompt) {
        //print out the input prompt.
        System.out.println(prompt);
        //read the word and return the word as a string.
        return in.nextLine();
    }
    //take in two word strings as a parameter.
    private boolean isAnagram(String word1, String word2) {
        //determine if the words are anagrams.
        String first = word1.replaceAll("\\s", "");
        String second = word2.replaceAll("\\s", "");
        boolean truthvalue = true;
        //if the two words are not equal in length:
        if (first.length() != second.length()){
            truthvalue = false;
            return truthvalue;
        }
        else{
            char[] arrayword1 = first.toLowerCase().toCharArray();
            char[] arrayword2 = second.toLowerCase().toCharArray();
            Arrays.sort(arrayword1);
            Arrays.sort(arrayword2);
            truthvalue = Arrays.equals(arrayword1,arrayword2);
        }
        //return the result.
        return truthvalue;
    }
    //take in three parameters: the two words and the truth value.
    private String displayOutput(String word1, String word2, boolean truthvalue){
        //if the passed in value is true:
        if(truthvalue)
            return word1 + " and " + word2 + " are anagrams." ;
        else
            return word1 + " and " + word2 + " are not anagrams." ;
    }
}
