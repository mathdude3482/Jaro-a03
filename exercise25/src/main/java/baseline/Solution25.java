package baseline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        app.password = app.getPassword("Enter a password:");
        //determine if the password is very weak, weak, strong, or very strong.
        app.determinenum = app.passwordValidator(app.password);
        //print out the result.
        app.displayresult = app.displayoutput(app.password, app.determinenum);
        System.out.println(app.displayresult);
    }

    //take in a prompt as the parameter.
    private String getPassword(String prompt) {
        //print out the prompt.
        System.out.println(prompt);
        //read in the user password and return it.
        return in.nextLine();
    }

    //take in the password as a parameter.
    public int passwordValidator(String password) {
        //declare an integer strength to determine how strong the password is.
        int strength = 0;
        //determine if the password is very weak, weak, strong, or very strong.
        //this is if the password is very weak.
        if(true) {
            final String NUM = "^(?=.*[0-9])";
            String regex1 = NUM + "(?=\\S+$).{1,8}$";
            Pattern p = Pattern.compile(regex1);
            Matcher m = p.matcher(password);
            //this is if the password is weak.
            String regex2 = "^(?=.*[a-zA-Z])" + "(?=\\S+$).{1,8}$";
            Pattern p2 = Pattern.compile(regex2);
            Matcher m2 = p2.matcher(password);
            //this is if the password is strong.
            String regex3 = NUM + "(?=.*[a-zA-Z])" + "(?=\\S+$).{8,20}$";
            Pattern p3 = Pattern.compile(regex3);
            Matcher m3 = p3.matcher(password);
            //this is if the password is very strong.
            String regex4 = NUM + "(?=.*[a-zA-Z])" + "(?=.*[^a-zA-Z0-9])" +
                    "(?=\\S+$).{8,20}$";
            Pattern p4 = Pattern.compile(regex4);
            Matcher m4 = p4.matcher(password);
            if (m.matches()) {
                strength = 1;
                return strength;
            }
            else if (m2.matches()) {
                strength = 2;
                return strength;
            }
            else if (m3.matches()) {
                strength = 3;
                return strength;
            }
            else if (m4.matches()) {
                strength = 4;
                return strength;
            }
            else
                strength = 0;
        }
        //return an integer designating the strength of the password.
        return strength;
    }

    private String displayoutput(String password, int determinevalue) {
        //take in an integer and the password as the parameters.
        //the integer passed in will represent the strength of the password.
        //declare a String result that will change based on the integer passed in.
        String result = "";
        final String PARTRESULT = "The password '";
        if (determinevalue == 1) {
            result = PARTRESULT + password + "'" + " is a very weak password.";
        } else if (determinevalue == 2) {
            result = PARTRESULT + password + "'" + " is a weak password.";
        } else if (determinevalue == 3) {
            result = PARTRESULT + password + "'" + " is a strong password.";
        } else if (determinevalue == 4)
            result = PARTRESULT + password + "'" + " is a very strong password.";
            //if not one of the four predetermined values, return an unknown strength.
        else
            result =  PARTRESULT + password + "'" + "is a password of unknown strength.";
        //return result.
        return result;
    }
}