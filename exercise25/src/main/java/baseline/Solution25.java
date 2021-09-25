package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that determines the complexity of a given password based on these rules:
//A very weak password contains only numbers and is fewer than eight characters.
//A weak password contains only letters and is fewer than eight characters.
//A strong password contains letters and at least one number and is at least eight characters.
//A very strong password contains letters, numbers,
//and special characters and is at least eight characters.
//If a password does not meet any of these rules, then report it as a password of unknown strength.
//Create a passwordValidator function that takes in the password as its argument
// and returns a numeric value you can evaluate to determine the password strength.
// Use a single output statement.
public class Solution25 {
    private static final Scanner in = new Scanner(System.in);
    private String password;
    private String displayresult;
    private int determinenum;
    public static void main(String[] args) {
        Solution25 app = new Solution25();
        //ask the user for a password.
        app.password = app.getPassword();
        //determine if the password is very weak, weak, strong, or very strong.
        app.determinenum = app.passwordValidator();
        //print out the result.
        app.displayresult = app.displayoutput();
    }

    private String getPassword() {
        //take in a prompt and print it.
        //read in the user password and return it.
        return "";
    }
    private int passwordValidator() {
        //take in the password as a parameter.
        //determine if the password is very weak, weak, strong, or very strong.
        //return an integer designating the strength of the password.
        return 0;
    }
    private String displayoutput() {
        //take in an integer as a parameter.
        //the integer passed in will represent the strength of the password.
        //declare a String result that will change based on the integer passed in.
        //return result.
        return "";
    }
}
