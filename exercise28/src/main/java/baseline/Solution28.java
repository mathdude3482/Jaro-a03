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
    public static void main(String[] args) {
        //Using a for loop, ask the user for 5 numbers.
        //enter for loop here:
        int[] num = new int[5];
        for (int i = 0; i <= 4; i++) {
          num[i] = getNum("Enter a number:");
        }
        //Calculate the sum of the 5 numbers.
        int sum = getSum(num);
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
    public static int getSum(int[] num) {
        //pass in 5 parameters: the 5 numbers the user inputted.
        //return the sum.
        return num[0] + num[1] + num[2] + num[3] + num[4];
    }
    private static String displaySum(int sum){
        //pass in one parameter: the sum.
        //return the result string.
        return "The total is " + sum + ".";
    }
}