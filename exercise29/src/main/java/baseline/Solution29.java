package baseline;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private static String rate;
    public static void main(String[] args) {
       // using a while loop, ask for the rate of return.
        // Don't allow the user to exit the while loop until they enter a valid number.
        //enter while loop here.
        int x = 0;
        while(x < 1){
            rate = getNum("What is the rate of return?");
            if(!isValid(rate)){
              System.out.println("Sorry. That's not a valid input.");
            }
            else{
                x++;
            }
        }
        //call a convertRate method to turn the rate into a double.
        double numrate = convertRate(rate);
       // call a calculate method to calculate the number of years.
        double numYears = calculate(numrate);
       // print the result.
        String outcome = displayOutput(numYears);
        System.out.println(outcome);
    }
    private static String getNum(String prompt) {
        //pass in one parameter: the prompt. Print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextLine();
    }
    public static boolean isValid(String rate) {
        //pass in one parameter: the rate as a string.
        //determine if the given String is valid.
        boolean determine = true;
        if(rate.equals("0")){
            return false;
        }
        else{
            //if there is any whitespace, remove it.
            String revisedrate = rate.replaceAll("\\s", "");
            String regex = "^(?=.*[a-zA-Z])" + "(?=\\S+$).{1,100}$";
            Pattern ratePattern = Pattern.compile(regex);
            Matcher matchrate = ratePattern.matcher(revisedrate);
            if(matchrate.matches()){
                determine = false;
                return determine;
            }
            else
                return determine;
        }
    }
    public static double convertRate(String rate) {
        //take in one parameter: the rate as a String.
        //convert the String into an integer.
        return Double.parseDouble(rate);
    }
    public static double calculate(double ratevalue) {
        //pass in one parameter: the rate as an integer.
        //return the number of years.
        return 72.00 / ratevalue;
    }
    private static String displayOutput(double numYears) {
        //pass in one parameter: the number of years.
        //round numYears to two decimal points.
        DecimalFormat value = new DecimalFormat("##.00");
        String years = value.format(numYears);
        //return the output String.
        return "It will take " + years + " years to double your initial investment.";
    }
}
