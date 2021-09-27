package baseline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that prompts for your age and your resting heart rate.
// Use the Karvonen formula to determine the target heart rate based on a range of intensities
// from 55% to 95%.
// Generate a table with the results as shown in the example output.
//Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
//Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
//Display the results in a tabular format.
public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    private static String age;
    private static String heartrate;
    public static void main(String[] args) {
        //Using a while loop, ask for the user's age and heart rate.
        //Enter while loop here. Declare a control value x to be zero.
        int x = 0;
        while(x < 1){
            age = getInfo("age: ");
            heartrate = getInfo("resting pulse: ");
            //check if the user input is valid.
            if(!(validInput(age) && validInput(heartrate))){
                //if invalid, keep asking the user for inputs.
                System.out.println("Sorry. There's at least one wrong input.");
            }
            else{
                //otherwise, exit the while loop.
                x++;
            }
        }
        //convert the String inputs into integers.
        int userAge = getAge(age);
        int userRHeartRate = getrHeartRate(heartrate);
            //Display the output by using a Display function, which calls a getHeartRate function.
        display(userAge, userRHeartRate);
    }
    //take in one parameter: the string prompt.
    private static String getInfo(String prompt) {
        //print out the prompt.
        System.out.print(prompt);
        //return user input.
        return in.nextLine();
    }
    public static boolean validInput(String input){
        //take in one parameter: the user input.
        //using regex, determine if the input is valid or not.
        boolean determine = true;
        //if there is any whitespace, remove it.
        String revisedinput = input.replaceAll("\\s", "");
        String regex = "^(?=.*[a-zA-Z])" + "(?=\\S+$).{1,100}$";
        Pattern ratePattern = Pattern.compile(regex);
        Matcher matchrate = ratePattern.matcher(revisedinput);
        //if there is any letter or special character, the input is invalid. Return false.
        if(matchrate.matches()){
            determine = false;
            return determine;
        }
        //otherwise, return true.
        return determine;
    }
    private static int getAge(String age){
        //pass in one parameter: the String age.
        //return the age as an integer.
        return Integer.parseInt(age);
    }
    private static int getrHeartRate(String rest){
        //pass in one parameter: the String resting heart rate.
        //return the hearting rate as an integer.
        return Integer.parseInt(rest);
    }
    //take in three parameters: the resting heart rate, the age, and the intensity percentage
    // as integers.
    public static double getheartRate(int age, int rest, int intensity) {
        //return the target heart rate, calculated by the Karvonen formula.
        double decimal = intensity / 100.00;
        return Math.round(((220 - age) - rest) * decimal + rest);
    }
    //pass in three parameters: the resting heart rate, the age, and the target heart rate.
    private static void display(int age, int rest){
        //Display the results in a table format.
        //use a for loop to print out the intensity.
        System.out.format("  %s         |  %s", "intensity", "rate");
        System.out.println();
        System.out.println("  ------------------|--------");
        for(int intensity = 55; intensity <=95; intensity +=5){
            String result = intensity + "%";
            System.out.format("  %4s              | %4.0f %n", result,
                    getheartRate(age, rest, intensity));
        }
        System.out.println();
    }
}
