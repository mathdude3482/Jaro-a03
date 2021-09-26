package baseline;
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
    public static void main(String[] args) {
        //call a class called PaymentCalculator,
        // which contains a method called calculateMonthsUntilPaidOff.
        //that will calculate the number of months needed to pay off a credit card balance.
        PaymentCalculator myData = new PaymentCalculator();
       int numMonth = myData.calculateMonthsUntilPaidOff();
        //print out the output.
        System.out.println(displayOutput(numMonth));
    }
    private static String displayOutput(int month) {
        //take in one parameter: the number of months.
        //print out the result.
        return "It will take you " + month + " months to pay off this card.";
    }
}
