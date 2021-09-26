package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Write a program that will help you determine how many months it will take
// to pay off a credit card balance.
// The program should ask the user to enter the balance of a credit card, the APR of the card,
// and their monthly payment.
// The program should then return the number of months needed (rounded up to the next integer value).
//Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff,
// which takes no parameters and returns the number of months.
//Prompt for the APR as a percentage, not a decimal.
//Round fractions of a cent up to the next cent for internal calculations.
public class Solution26 {
    private static final Scanner in = new Scanner(System.in);
    private double balance;
    private double APR;
    private double payment;
    private int numMonth;
    private String result;
    public static void main(String[] args) {
        Solution26 app = new Solution26();
        //ask the user for their balance, the APR (as a percentage), and the monthly payment.
        app.balance = app.getInfo();
        app.APR = app.getInfo();
        app.payment = app.getInfo();
        //call a class called PaymentCalculator,
        // which contains a method called calculateMonthsUntilPaidOff.
        //that will calculate the number of months needed to pay off a credit card balance.
        PaymentCalculator myData = new PaymentCalculator();
        app.numMonth = myData.calculateMonthsUntilPaidOff();
        //print out the output.
        app.result = app.displayOutput();
    }
    private double getInfo() {
        //take in a String prompt as a parameter. Print the prompt.
        //return the user input.
        return 0;
    }
    private String displayOutput() {
        //take in one parameter: the number of months.
        //print out the result.
        return "";
    }
}
