package baseline;
import java.util.Random;
import java.util.Scanner;

import static baseline.GetData.convertGuess;
import static baseline.ValidateInput.invalidAnswer;

public class PlayGame {
    //hide the implicit public constructor.
    private PlayGame(){
    }
    //variables needed for the class.
    private static final Scanner guess = new Scanner(System.in);
    private static final Random RN = new Random();
    private static final String PROMPT = "I have my number. What is your guess?";
    private static final String SPECIAL = "Incorrect input. Guess again.";
    private static final String HIGH = "Too high. Guess again.";
    private static final String LOW = "Too low. Guess again.";
    private static int numGuesses;
    private static int computeranswer;
    //each method here will take in no parameters.
    //each method performs the same actions: the computer gets a random integer depending
    //on the level of difficulty, and the user must guess the computer's number.
    public static int level1() {
        //declare numGuesses to keep count of the number of guesses a user takes.
        numGuesses = 0;
        int x = 0;
        computeranswer = RN.nextInt(10) + 1;
        System.out.print(PROMPT);
        while(x < 1) {
            String myanswer = guess.nextLine();
            if ((invalidAnswer(myanswer))) {
                System.out.print(SPECIAL);
                numGuesses++;
            }
            else {
                int myguess = convertGuess(myanswer);
                if (myguess < computeranswer) {
                    System.out.print(LOW);
                    numGuesses++;
                }
                else if (myguess > computeranswer) {
                    System.out.print(HIGH);
                    numGuesses++;
                }
                else {
                    numGuesses++;
                    x++;
                }
            }
        }
        return numGuesses;
    }
    public static int level2() {
        numGuesses = 0;
        int x = 0;
        computeranswer = RN.nextInt(100) + 1;
        System.out.print(PROMPT);
        while(x < 1) {
            String myanswer = guess.nextLine();
            if ((invalidAnswer(myanswer))) {
                System.out.print(SPECIAL);
                numGuesses++;
            }
            else{
                int myguess = convertGuess(myanswer);
                if (myguess < computeranswer) {
                    System.out.print(LOW);
                    numGuesses++;
                }
                else if (myguess > computeranswer) {
                    System.out.print(HIGH);
                    numGuesses++;
                }
                else {
                    numGuesses++;
                    x++;
                }
            }
        }
        return numGuesses;
    }
    public static int level3() {
        numGuesses = 0;
        int x = 0;
        computeranswer = RN.nextInt(1000) + 1;
        System.out.print(PROMPT);
        while(x < 1) {
            String myanswer = guess.nextLine();
            if ((invalidAnswer(myanswer))) {
                System.out.print(SPECIAL);
                numGuesses++;
            }
            else {
                int myguess = convertGuess(myanswer);
                if (myguess < computeranswer) {
                    System.out.print(LOW);
                    numGuesses++;
                }
                else if (myguess > computeranswer) {
                    System.out.print(HIGH);
                    numGuesses++;
                }
                else {
                    numGuesses++;
                    x++;
                }
            }
        }
        return numGuesses;
    }
}
