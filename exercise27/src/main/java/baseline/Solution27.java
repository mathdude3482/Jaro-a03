package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Write a program that prompts for a first name, last name, employee ID, and ZIP code.
// Ensure that the input is valid according to these rules:
// The first name must be filled in.
// The last name must be filled in.
// The first and last names must be at least two characters long.
// An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
// The ZIP code must be a number.
//Display appropriate error messages on incorrect data.
/*Create a function for each validation rule.
Then create a validateInput function that takes in all of the input data
and invokes the specific validation functions.
Use a single output statement to display the outputs.
*/
public class Solution27 {
    private static final Scanner in = new Scanner(System.in);
    private static String firstname;
    private static String lastname;
    private static String zipcode;
    private static String id;
    private static String valid;
    public static void main(String[] args) {
        //ask the user for 4 inputs:
        //the first name, the last name, the zip code, and the employee ID.
        firstname = getInfo();
        lastname = getInfo();
        zipcode = getInfo();
        id = getInfo();
        //call validateInput, which will validate all the input data using
        //helper functions to validate each input.
        valid = validateInput();
        //display the appropriate output.
        System.out.println(valid);
    }
    private static String getInfo() {
        //take in 1 parameter: the prompt. Print out the prompt.
        //return the user input.
        return "";
    }
    private static String validateInput() {
        //take in 4 parameters: the first name, the last name, the id, and the zipcode.
        //test validity of the inputs using helper functions for each input.
        int valid1 = validateFirst();
        int valid2 = validateLast();
        int valid3 = validateID();
        int valid4 = validateZip();
        //return a String based on the validity of the inputs.
        return "";
    }
    private static int validateFirst() {
        //take in 1 parameter: the first name.
        //if the first name is valid, return 1.
        //otherwise, return 0.
        return 0;
    }
    private static int validateLast() {
        //take in 1 parameter: the last name.
        //if the last name is valid, return 1.
        //otherwise, return 0.
        return 0;
    }
    private static int validateID() {
        //take in 1 parameter: the ID.
        //if the first name is valid, return 1.
        //otherwise, return 0.
        return 0;
    }
    private static int validateZip() {
        //take in 1 parameter: the zip code.
        //if the zip code is valid, return 1.
        //otherwise, return 0.
        return 0;
    }
}
