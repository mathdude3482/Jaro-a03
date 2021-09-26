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
    private static final String MESSAGE = "enter a number:";
    private static int num1;
    private static int num2;
    private static int num3;
    private static int num4;
    private static int num5;
    public static void main(String[] args) {
       //Using a for loop, ask the user for 5 numbers.
        //enter for loop here:
        for (int i = 0; i < 1; i++) {
             num1 = getNum(MESSAGE);
             num2 = getNum(MESSAGE);
             num3 = getNum(MESSAGE);
             num4 = getNum(MESSAGE);
             num5 = getNum(MESSAGE);
        }
       //Calculate the sum of the 5 numbers.
       int sum = getSum(num1, num2, num3, num4, num5);
       //Display the sum.
        String result = displaySum(sum);
        System.out.println(result);
    }
    private static int getNum(String prompt) {
        //pass in the prompt. Print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextInt();
    }
    public static int getSum(int first, int second, int third, int fourth, int fifth) {
        //pass in 5 parameters: the 5 numbers the user inputted.
        //return the sum.
        return first + second + third + fourth + fifth;
    }
    private static String displaySum(int sum){
        //pass in one parameter: the sum.
        //return the result string.
        return "The total is " + sum + ".";
    }
}
