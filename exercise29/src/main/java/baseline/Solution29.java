package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Write a quick calculator that prompts for the rate of return on an investment
// and calculates how many years it will take to double your investment.
//Don’t allow the user to enter 0.
//Don’t allow non-numeric values.
//Use a loop to trap bad input, so you can ensure that the user enters valid values.
public class Solution29 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       // using a while loop, ask for the rate of return.
        //enter while loop here:
        int rate = getNum();
       // Don't allow the user to exit the while loop until they enter a valid number.
       // call a calculate method to calculate the number of years.
        int numYears = calculate();
       // print the result.
        String outcome = displayOutput();
        System.out.println(outcome);
    }

    private static String displayOutput() {
        //pass in one parameter: the number of years.
        //create a String result that will contain the output String.
        String result = "";
        //return result.
        return result;
    }

    private static int getNum() {
        //pass in one parameter: the prompt. Print out the prompt.
        //return the user input.
        return 0;
    }
    private static int calculate() {
        //pass in one parameter: the rate of return.
        //return the number of years.
        return 0;
    }

}
