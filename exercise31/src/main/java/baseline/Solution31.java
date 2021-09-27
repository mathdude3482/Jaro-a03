package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that prompts for your age and your resting heart rate.
// Use the Karvonen formula to determine the target heart rate based on a range of intensities
// from 55% to 95%.
// Generate a table with the results as shown in the example output.
//Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
//Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
//Display the results in a tabular format.
public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    private static String age;
    private static String heartrate;
    private static int intensity;
    private static int target;
    public static void main(String[] args) {
        //Using a while loop, ask for the user's age and heart rate.
        //Enter while loop here.
        age = getInfo();
        heartrate = getInfo();
        //check if the user input is valid.
        //Don't allow the user to escape the loop until they pass in valid inputs.
        //Using a for loop, call a method called calculate, which will calculate the target heart rate.
        //Enter for loop here.
        target = getheartRate();
        //Display the output by using a Display function.
        display();
    }
    private static String getInfo() {
        //take in one parameter: the string prompt.
        //print out the prompt.
        //return user input.
        return "";
    }
    public static boolean validInput(){
        //take in two parameters: the user's age and the user's heart rate.
        //using regex, determine if the input is valid or not.
        //if valid, return true.
        //otherwise, return false.
        return true;
    }
    public static int getAge(){
        //pass in one parameter: the String age.
        //return the age as an integer.
        return 0;
    }
    public static int getrHeartRate(){
        //pass in one parameter: the String resting heart rate.
        //return the hearting rate as an integer.
        return 0;
    }
    public static int getheartRate() {
        //take in three parameters: the resting heart rate, the age, and the intensity percentage
        // as integers.
        //return the target heart rate, calculated by the Karvonen formula.
        return 0;
    }
    private static void display(){
        //pass in four parameters: the resting heart rate, the age, the intensity percentage,
        //and the target heart rate.
        //Display the results in a table format.
        System.out.println();
    }
}
