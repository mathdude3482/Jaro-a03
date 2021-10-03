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
        //Ask the user for a list of numbers, separated by spaces.
        String getList = app.getInfo("Enter a list of numbers, separated by spaces: ");
        //create a string array that takes care of any whitespace the user inputs.
        String[] numArray = getList.split("\\s+");
        //Store the integers into an ArrayList of integers called oldList.
        List <Integer> oldList = app.getNumber(numArray);
        //Call a function called filterEvenNumbers that will filter out the even numbers.
        List <Integer> newList = app.filterEvenNumbers(oldList);
        //Display the even numbers.
        app.displayEvenNumbers(newList);
    }
    //take one parameter: the prompt.
    private String getInfo(String prompt){
        Scanner in = new Scanner(System.in);
        //print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextLine();
    }
    private List <Integer> getNumber(String[] numArray) {
        //take in 1 parameter: an array of numbers that are String type.
        //return the list of integers.
        List<Integer> numList = new ArrayList<>();
        //using a for loop that runs from 0 to the length of the string array, add the elements.
        for ( int x = 0; x < numArray.length; x++){
            //store each number into a temp variable.
            String temp = numArray[x];
            //convert the strings into an integer and add them into numList.
            numList.add(Integer.parseInt(temp));
        }
        //return numList.
        return numList;
    }
    public List<Integer> filterEvenNumbers(List<Integer> firstList) {
        //take in one parameter: the List of the inputted numbers the user provides.
        //create a new List called even that stores even numbers.
        List<Integer> even = new ArrayList<>();
        int length = firstList.size();
        //using a for loop that runs from 0 to the size of the list, determine which numbers are even.
        for (int x = 0; x < length; x++){
            //if a number is even, add it to the even list.
            if (isEven(firstList.get(x)))
                even.add(firstList.get(x));
        }
        //return the even list.
        return even;
    }
    public boolean isEven(int num){
        //take in one parameter: a number.
        //return a truth value based on if the number is even or not.
        return num % 2 == 0;
    }
    private void displayEvenNumbers(List<Integer> even) {
        //take in one parameter: the list of even numbers.
        System.out.println("The even numbers are: ");
        for (int x: even)
            System.out.print(x + " ");
    }
}
