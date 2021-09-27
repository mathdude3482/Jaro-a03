package baseline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public static void main(String[] args) {
        //ask the user for 4 inputs:
        //the first name, the last name, the zip code, and the employee ID.
        String firstname = getInfo("Enter the first name:");
        String lastname = getInfo("Enter the last name:");
        String zipcode = getInfo("Enter the zipcode:");
        String id = getInfo("Enter the employee ID:");
        //call validateInput, which will validate all the input data using
        //helper functions to validate each input.
       String valid = validateInput(firstname, lastname, zipcode, id);
        //display the appropriate output.
        System.out.println(valid);
    }
    private static String getInfo(String prompt) {
        //take in 1 parameter: the prompt. Print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextLine();
    }
    public static String validateInput(String first, String last, String zip, String iD) {
        //take in 4 parameters: the first name, the last name, the id, and the zipcode.
        //define a String result that will be used to store the result of the function.
        //test validity of the inputs using helper functions for each input.
        int valid1 = validateFirst(first);
        int valid2 = validateLast(last);
        int valid3 = validateZip(zip);
        int valid4 = validateID(iD);
        //if first and last are empty:
        if (first.length() == 0){
            valid1 = -1;
        }
        if (last.length() == 0){
            valid2 = -1;
        }
        //return the displayoutput based on the validity of each input.
        return displayOutput(valid1, valid2, valid3, valid4);
    }

    public static String displayOutput(int valid1, int valid2, int valid3, int valid4) {
        //take in 4 parameters: the results of the validity tests on each input.
        String result = "";
        if(valid1 == -1){
            result = result + "\nThe first name should be filled in.";
        }
        if(valid1 == 0){
            result = result + "\nThe first name must be at least 2 characters long.";
        }
        if(valid2 == -1){
            result = result + "\nThe last name must be filled in.";
        }
        if (valid2 == 0){
            result = result + "\nThe last name must be at least 2 characters long.";
        }
        if(valid3 == 0){
            result = result + "\nThe zipcode must be a 5 digit number.";
        }
        if (valid4 == 0){
            result = result + "\nThe employee ID must be in the format of AA-1234.";
        }
        else
            result = result + "\nThere were no errors found.";
        return result;
    }

    private static int validateFirst(String first) {
        //take in 1 parameter: the first name.
        //declare an integer valid that will be used to determine if the String is valid or not.
        int determine = 0;
        //if the first name follows the format, determine = 1.
        //otherwise, return 0.
        //if the user inputs white space, remove it.
        String revisedFirst = first.replaceAll("\\s","");
        String regex1 = "(?=.*[a-zA-Z])" + "(?=\\S+$).{2,20}$";
        Pattern name = Pattern.compile(regex1);
        Matcher match = name.matcher(revisedFirst);
        if (match.matches()){
            determine = 1;
        }
        return determine;
    }
    private static int validateLast(String last) {
        //take in 1 parameter: the last name.
        //declare an integer valid that will be used to determine if the String is valid or not.
        int determine = 0;
        //if the last name follows the format, valid = 1.
        //otherwise, return 0.
        //if the user inputs white space, remove it.
        String revisedLast = last.replaceAll("\\s","");
        String regex2 = "^(?=.*[a-zA-Z])" + "(?=\\S+$).{2,20}$";
        Pattern name = Pattern.compile(regex2);
        Matcher match = name.matcher(revisedLast);
        if (match.matches()){
            determine = 1;
        }
        return determine;
    }
    private static int validateZip(String zipcode) {
        //take in 1 parameter: the zip code.
        //if the zip code is valid, determine = 1.
        //otherwise, determine = 0.
        //if there is white space, remove it.
        int determine = 0;
        String revisedzip = zipcode.replaceAll("\\s", "");
        String regex3 = "^(?=.*[0-9])" + "(?=\\S+$).{5}$";
        Pattern iDpattern = Pattern.compile(regex3);
        Matcher id = iDpattern.matcher(revisedzip);
        if (id.matches()){
            determine = 1;
        }
        return determine;
    }
    private static int validateID(String iD) {
        //take in 1 parameter: the ID.
        //if the ID is valid, return 1.
        //otherwise, return 0.
        //if there is any white space, remove it.
        int determine = 0;
        String revisedID = iD.replaceAll("\\s", "");
        final String PART = "^(?=.*[0-9])";
        final String PART2 = "(?=.*[a-zA-Z])";
        String regex4 =  PART + PART2 + "(?=.*[-])" + "(?=\\S+$).{7}$";
        Pattern iDpattern = Pattern.compile(regex4);
        Matcher id = iDpattern.matcher(revisedID);
        if (id.matches()){
            determine = 1;
        }
        return determine;
    }
}
