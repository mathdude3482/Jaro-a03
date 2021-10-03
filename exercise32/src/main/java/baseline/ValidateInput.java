package baseline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateInput {
    //hide the implicit public constructor.
    public boolean validInput(String difficulty){
        //pass in one parameter: the user input.
        //Using Java Regex, if the input is not 1,2 or 3, return false.
        boolean determine = true;
        //if there is any whitespace, remove it.
        String revisedDifficulty = difficulty.replaceAll("\\s", "");
        String regex = "^(?=.*[a-zA-Z045789])" + "(?=\\S+$).{1,100}$";
        Pattern difficultyPattern = Pattern.compile(regex);
        Matcher difficultyMatch = difficultyPattern.matcher(revisedDifficulty);
        if((difficultyMatch.matches())){
            determine = false;
            return determine;
        }
        //otherwise, return true.
        return determine;
    }
    public boolean invalidAnswer(String guessnum){
        //pass in one parameter: the user input.
        //Using Java Regex, if the input is not a number, return false.
        boolean determine = true;
        //if there is any whitespace, remove it.
        String revisedDifficulty = guessnum.replaceAll("\\s", "");
        String regex = "^(?=.*[^0-9])" + "(?=\\S+$).{1,100}$";
        Pattern difficultyPattern = Pattern.compile(regex);
        Matcher difficultyMatch = difficultyPattern.matcher(revisedDifficulty);
        if((difficultyMatch.matches())){
            return determine;
        }
        //otherwise, return true.
        else{
            determine = false;
        }
        return determine;
    }
}
