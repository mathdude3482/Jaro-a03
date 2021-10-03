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
    public static void main(String[] args) {
        //use a while loop to run the program.
        // The while loop runs while a control variable x is less than 1.
        Solution32 myApp = new Solution32();
        System.out.println("Let's play guess the number!");
        System.out.println();
        int x = 0;
        //enter the while loop here.
        while(x < 1){
        //prompt the user for a difficulty.
            GetData myData = new GetData();
            ValidateInput myInput = new ValidateInput();
            String difficulty = myData.getDifficulty("Enter a difficulty(1, 2, or 3):");
        //check the user input for difficulty if it is 1, 2, or 3.
        if(!(myInput.validInput(difficulty)))
            {
                //If the input does not check out to be 1,2 or 3 (or some combination of the values),
                // keep asking the user to input a correct value.
                System.out.println("Incorrect input.");
            }
        else
            {
                //otherwise, add one and stop the loop.
                //turn the String into an integer.
                //take out any whitespaces if there is any.
                String revisedDifficulty = difficulty.replaceAll("\\s", "");
                int level = myData.convertDifficulty(revisedDifficulty);
                // call the difficultyLevel method. This will return the number of guesses a user
                //needed to guess the correct answer.
                int numGuess = myApp.difficultyLevel(level);
                //Display the number of guesses a user needed using the displayOutput method.
                String result = myApp.displayOutput(numGuess);
                System.out.println(result);
                //ask if the user wants to play again.
                Scanner again = new Scanner(System.in);
                System.out.println();
                System.out.print("Do you want to play again? (Y/N)");
                String play = again.nextLine();
                //if the user wants to keep playing, keep x at 0.
                if(play.equals("Y") || play.equals("y")){
                    x = 0;
                }
                //otherwise, add 1 and end the program.
                else{
                    x++;
                }
            }
        }
    }

    //pass in one parameter: the difficulty level.
    private int difficultyLevel(int level) {
        PlayGame myGame = new PlayGame();
        //based on the difficulty level, the program will call a function from PlayGame that goes with
        //the corresponding difficulty.
        if(level == 1){
            return myGame.level1();
        }
        else if(level == 2){
            return myGame.level2();
        }
        else if(level == 3){
            return myGame.level3();
        }
        //return 0 if level is not 1, 2, or 3, to indicate that the input is invalid.
        return 0;
    }
    //take in one parameter: the number of guesses.
    private String displayOutput(int guess) {
        if(guess == 0){
            //this statement is if somehow the input got past the validInput function.
            return "Incorrect input.";
        }
        //return the output String.
        return "You got it in " + guess +  " guesses!";
    }
}