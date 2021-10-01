package baseline;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
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
    private static StringBuilder newPassword;
    private static Random rand = new Random();
    private static char num;
    private static char newSymbol;
    private static char alpha;
    private static char alpha2;
    public static void main(String[] args) {
        //Ask the user for the minimum length of the password,
        //as well as how many numbers and special characters they desire.
        Solution37 app = new Solution37();
        int length = app.getInfo("What's the minimum length? ");
        int numSpecial = app.getInfo("How many special characters? ");
        int numNumbers = app.getInfo("How many numbers? ");
        //Call a function getPassword that returns the password based on the specifications.
        StringBuilder password = getPassword(length, numSpecial, numNumbers);
        //Print out the password.
        String display = displayPassword(password);
        System.out.println(display);
    }
    private int getInfo(String prompt) {
        Scanner in = new Scanner(System.in);
        //take in one parameter: the prompt.
        //print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextInt();
    }
    private static StringBuilder getPassword(int length, int specialChar, int numNumbers) {
        //take in three parameters: the length, the number of digits,
        // and the number of special characters.
        //store the characters used to make a password into an ArrayList.
        if((length / 2 ) >= specialChar && (length / 2) >= numNumbers){
                StringBuilder password = new StringBuilder(length);
                List<Character> specialSymbol = getSymbol();
                //use a random number generator to create a password.
                int count = 0;
                do {
                    int choose = rand.nextInt(4);
                    for(int i = 0; i < numNumbers; i++)
                        num = (char) (rand.nextInt((57 - 48) + 1) + 48);
                    if (choose == 0) {
                        password.append(num);
                        count++;
                    }
                    for (int j = 0; j < specialChar; j++)
                        newSymbol = specialSymbol.get(rand.nextInt(specialSymbol.size()));
                    if (choose == 1) {
                        password.append(newSymbol);
                        count++;
                    }
                    for (int k = 0; k < length - specialChar - numNumbers; k++)
                         alpha = (char) ((rand.nextInt(90 - 65) + 1) + 65);
                    if (choose == 2){
                        password.append(alpha);
                        count++;
                    }
                    for(int j = 0 ; j < length - specialChar - numNumbers; j++)
                         alpha2 = (char) ((rand.nextInt(122 - 97) + 1) + 97);
                    if (choose == 3){
                        password.append(alpha2);
                        count++;
                    }
                }while (count < length);
                //Ensure that the password has as many letters as numbers and special characters.
                //return the randomly generated password.
                newPassword = password;
            }
        return newPassword;
    }
    private static List<Character> getSymbol(){
        List<Character> newList = new ArrayList<>();
        char[] special = new char[32];
        for (int l = 0; l < 15; l++){
            special[l] = (char)(33 + l);
        }
        for (int m = 15; m < 22; m++){
            special[m] = (char)(43 + m);
        }
        for (int n = 22; n < 28; n++){
            special[n] = (char)(69 + n);
        }
        for (int z = 28; z < 32; z++){
            special[z] = (char)(95 + z);
        }
        for(char ch4: special){
            newList.add(ch4);
        }
        return newList;
    }
    private static String displayPassword(StringBuilder password) {
        //take in one parameter: the randomly generated password.
        //return the result.
        if(password == null){
            return "Incorrect specifications.";
        }
        return "Your password is " + password;
    }

}
