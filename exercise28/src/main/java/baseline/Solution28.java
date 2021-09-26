package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Write a program that prompts the user for five numbers and computes the total of the numbers.
//The prompting must use repetition, such as a counted loop, not three separate prompts.
public class Solution28 {
    private static final Scanner in = new Scanner(System.in);
    private static int num1;
    private static int num2;
    private static int num3;
    private static int num4;
    private static int num5;
    private static int sum;
    public static void main(String[] args) {
       //Using a for loop, ask the user for 5 numbers.
        //enter for loop here:
        num1 = getNum();
        num2 = getNum();
        num3 = getNum();
        num4 = getNum();
        num5 = getNum();
       //Calculate the sum of the 5 numbers.
        sum = getSum();
       //Display the sum.

    }
    private static int getNum() {
        //pass in the prompt. Print out the prompt.
        //return the user input.
        return 0;
    }
    private static int getSum() {
        //pass in 5 parameters: the 5 numbers the user inputted.
        //return the sum.
        return 0;
    }
    private static String displaySum(){
        //pass in one parameter: the sum.
        String result = "";
        //return the result string.
        return result;
    }
}
