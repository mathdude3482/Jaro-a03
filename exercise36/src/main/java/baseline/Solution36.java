package baseline;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Write a program that prompts for response times from a website in milliseconds.
// It should keep asking for values until the user enters “done.”
//The program should print the average time (mean), the minimum time,
// the maximum time, and the population standard deviation.
//Create functions called average, max, min, and std,
// which take in a list of numbers and return the results.
//Use loops and arrays to perform the input and mathematical operations.
//Be sure to exclude the "done" entry from the inputs.
//Be sure to properly ignore any invalid inputs.
//Keep the input separate from the processing and the output.
public class Solution36 {
    public static final Scanner in = new Scanner(System.in);
    public static final ArrayList<String> numbers = new ArrayList<>();
    public static void main(String[] args) {
        //Ask the user for a number. Do this in a do-while loop.
        //enter the do-while loop here.
        String data = getData();
        //Check if the user input is valid.
        boolean valid = checkData();
        //If user input is invalid, do not store the string into the array.
        //Ask the user again for correct values.
        //Otherwise, store the inputs into the array.
        //If the user input is done, exit the loop.
        //call the convertData function to convert the Strings into doubles.
        ArrayList <Double> newList = convertData();
        //Call the functions of the Calculate class (functions listed above)
        //and store them into either integers or doubles.
        double average = Calculate.getAverage();
        double min = Calculate.getMinimum();
        double max = Calculate.getMaximum();
        double stdev = Calculate.getstDeviation();
        //display the results.
    }

    private static String getData() {
        //take in one parameter: the prompt.
        //print out the prompt.
        //return the user input.
        return "";
    }
    private static boolean checkData() {
        //take in one parameter: the user input.
        //check if the user input is either a number or the word done.
        //if this is the case, return true.
        //otherwise, return false.
        return true;
    }
    private static ArrayList convertData() {
        //take in one parameter: the ArrayList of Strings.
        //use a for loop here.
        //convert each element into a double.
        //store these doubles into an ArrayList of doubles.
        //return the new ArrayList.
        return numbers;
    }
}
