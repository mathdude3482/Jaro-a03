package baseline;
import java.util.Random;
import java.util.Scanner;
public class PlayGame {
    //hide the implicit public constructor.
    //variables needed for the class.
    private static final Scanner guess = new Scanner(System.in);
    private Random random;
    private GetData myData = new GetData();
    private String prompt = "I have my number. What is your guess?";
    private String special = "Incorrect input. Guess again.";
    private String high = "Too high. Guess again.";
    private String low = "Too low. Guess again.";
    private int numGuesses;
    private int computeranswer;
    public PlayGame(){
        random = new Random();
    }
    public PlayGame(boolean state){
        if(state) {
            random = new Random(1);
        }
    }
    ValidateInput myInput = new ValidateInput();
    //each method here will take in no parameters.
    //each method performs the same actions: the computer gets a random integer depending
    //on the level of difficulty, and the user must guess the computer's number.
    public int level1() {
        //declare numGuesses to keep count of the number of guesses a user takes.
        numGuesses = 0;
        int x = 0;
        computeranswer = random.nextInt(10) + 1;
        System.out.print(prompt);
        while(x < 1) {
            String myanswer = guess.nextLine();
            if ((myInput.invalidAnswer(myanswer))) {
                System.out.print(special);
                numGuesses++;
            }
            else {
                int myguess = myData.convertGuess(myanswer);
                if (myguess < computeranswer) {
                    System.out.print(low);
                    numGuesses++;
                }
                else if (myguess > computeranswer) {
                    System.out.print(high);
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
    public int level2() {
        numGuesses = 0;
        int x = 0;
        computeranswer = random.nextInt(100) + 1;
        System.out.print(prompt);
        while(x < 1) {
            String myanswer = guess.nextLine();
            if ((myInput.invalidAnswer(myanswer))) {
                System.out.print(special);
                numGuesses++;
            }
            else{
                int myguess = myData.convertGuess(myanswer);
                if (myguess < computeranswer) {
                    System.out.print(low);
                    numGuesses++;
                }
                else if (myguess > computeranswer) {
                    System.out.print(high);
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
    public int level3() {
        numGuesses = 0;
        int x = 0;
        computeranswer = random.nextInt(1000) + 1;
        System.out.print(prompt);
        while(x < 1) {
            String myanswer = guess.nextLine();
            if ((myInput.invalidAnswer(myanswer))) {
                System.out.print(special);
                numGuesses++;
            }
            else {
                int myguess = myData.convertGuess(myanswer);
                if (myguess < computeranswer) {
                    System.out.print(low);
                    numGuesses++;
                }
                else if (myguess > computeranswer) {
                    System.out.print(high);
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
