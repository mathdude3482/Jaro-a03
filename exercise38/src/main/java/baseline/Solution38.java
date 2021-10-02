package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that prompts for a list of numbers, separated by spaces.
// Have the program print out a new list containing only the even numbers.
public class Solution38 {
   private static Solution38 app = new Solution38();
    public static void main(String[] args) {
        //Ask the user for a list of numbers, seperated by spaces.
        //Store the integers into an ArrayList of integers called oldList.
        List <Integer> oldList = app.getNumber();
        //Convert the strings into integers.
        //Call a function called filterEvenNumbers that will filter out the even numbers.
        List <Integer> newList = app.filterEvenNumbers();
        //Display the even numbers.
    }
    private String getInfo(){
        Scanner in = new Scanner(System.in);
        //take one parameter: the prompt.
        //print out the prompt.
        //return the user input.
        return "";
    }
    private List <Integer> getNumber() {
        //take in no parameters.
        //return the list of integers.
        List<Integer> numList = new ArrayList<>();
        //create a string array that takes care of any whitespace the user inputs.
        //using a for loop that runs from 0 to the length of the string array, add the elements.
        //return numList.
        return numList;
    }
    private List<Integer> filterEvenNumbers() {
        //take in one parameter: the List of the inputted numbers the user provides.
        //create a new List called even that stores even numbers.
        List<Integer> even = new ArrayList<>();
        //using a for loop that runs from 0 to the size of the list, determine which numbers are even.
        //if a number is even, add it to the even list.
        //return the even list.
        return even;
    }
    private boolean isEven(){
        //take in one parameter: a number.
        //determine if the number is even using modulus.
        //return true if the number is even.
        return true;
    }
}
