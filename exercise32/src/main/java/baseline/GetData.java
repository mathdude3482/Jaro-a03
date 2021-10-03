package baseline;
import java.util.Scanner;
//this class is used to collect input data from the user.
public class GetData {
    private static final Scanner in = new Scanner(System.in);
    public String getDifficulty(String prompt) {
        //pass in one parameter: the prompt. Print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextLine();
    }
    //pass in one parameter: the user input.
    public int convertDifficulty(String difficulty) {
        //return the level of difficulty as an integer.
        return Integer.parseInt(difficulty);
    }
    public int convertGuess(String numguess){
        return Integer.parseInt(numguess);
    }
}
