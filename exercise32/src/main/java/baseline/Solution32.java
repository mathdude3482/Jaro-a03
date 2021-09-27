package baseline;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Write a Guess the Number game that has three levels of difficulty.
// The first level of difficulty would be a number between 1 and 10.
// The second difficulty set would be between 1 and 100.
// The third difficulty set would be between 1 and 1000.
//Based on the difficulty,
//The computer picks a random number in that range and prompts the player to guess that number.
// Each time the player guesses, the computer should give the player a hint as to whether
// the number is too high or too low. The computer should also keep track of the number of guesses.
// Once the player guesses the correct number,
// the computer should present the number of guesses and ask if the player would like to play again.
//Don’t allow any non-numeric data entry.
//During the game, count non-numeric entries as wrong guesses.
public class Solution32 {
    private final static Scanner in = new Scanner(System.in);
    private static String difficulty;
    private static int numGuesses;
    public static void main(String[] args) {
        //use a while loop to run the program.
        // The while loop runs while a control variable x is less than 1.
        //prompt the user for a difficulty.
        //enter the while loop here.
        difficulty = getDifficulty();
        //check the user input for difficulty if it is 1, 2, or 3.
        validInput();
        //If the user does not check out to be 1,2 or 3, end the program by adding 1 to x.
        //Otherwise, convert the input into an integer.
        int level = convertDifficulty();
        // call the difficultyLevel method. This will return the number of guesses a user
        //needed to guess the correct answer.
        numGuesses = difficultyLevel();
        //Display the number of guesses a user needed using the displayOutput method.
       String result = displayOutput();
        //ask if the user wants to play again.
        Scanner again = new Scanner(System.in);
        String play = again.nextLine();
        //if the user doesn't want to play again, add 1 to the control variable of the while loop.
    }
    private static String getDifficulty() {
        //pass in one parameter: the prompt. Print out the prompt.
        //return the user input.
        return "";
    }
    public static boolean validInput(){
        //pass in one parameter: the user input.
        //Using Java Regex, if the input is not 1,2 or 3, return false.
        //otherwise, return true.
        return true;
    }
    private static int convertDifficulty() {
        //pass in one parameter: the user input.
        //return the level of difficulty as an integer.
        return 0;
    }
    private static int difficultyLevel() {
        //pass in one parameter: the difficulty level.
        //based on the difficulty level, the program will choose a number from a given range.
        //prompt the user to guess what the number is.
        //if the user guesses incorrectly, the program will prompt either too high or too low
        //depending on the user input.
        //record the number of guesses using numGuesses. After a user guesses, add 1 to numGuesses.
        //if the guess is incorrect, keep asking the user to guess until they get it right. Keep adding
        //1 for every guess the user does.
        numGuesses = 0;
        //return numGuesses.
        return numGuesses;
    }
    private static String displayOutput() {
        //take in one parameter: the number of guesses.
        //return the output String.
        return "";
    }

}
