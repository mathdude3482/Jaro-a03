package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that generates a secure password.
// Prompt the user for the minimum length,
// the number of special characters, and the number of numbers.
// Then generate a password for the user using those inputs.
//Use lists to store the characters you’ll use to generate the passwords.
//Ensure that the generated password is random.
//Ensure that there are at least as many letters are there are special characters and numbers.
public class Solution37 {
    public static void main(String[] args) {
        //Ask the user for the minimum length of the password,
        //as well as how many numbers and special characters they desire.
        int length = getInfo();
        int numNumbers = getInfo();
        int numSpecial = getInfo();
        //Call a function getPassword that returns the password based on the specifications.
        String password = getPassword();
        //Ensure that the password has as many letters as numbers and special characters.
        //Print out the password.
        String display = displayPassword();
    }
    private static int getInfo() {
        //take in one parameter: the prompt.
        //print out the prompt.
        //return the user input.
        return 0;
    }
    private static String getPassword() {
        //take in three parameters: the length, the number of digits,
        // and the number of special characters.
        //use a random number generator to create a password.
        //return the randomly generated password.
        return "";
    }
    private static String displayPassword() {
        //take in one parameter: the randomly generated password.
        //return the result.
        return "";
    }

}
