package baseline;

import java.util.*;

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
    private Random rand = new Random();
    public static void main(String[] args) {
        Solution37 app = new Solution37();
        //Ask the user for the minimum length of the password,
        //as well as how many numbers and special characters they desire.
        int length = app.getInfo("What's the minimum length? ");
        int numSpecial = app.getInfo("How many special characters? ");
        int numNumbers = app.getInfo("How many numbers? ");
        //Call a function getPassword that returns the password based on the specifications.
        List<Character> getpassword = app.getPassword(length, numSpecial, numNumbers);
        String password = app.convertPassword(getpassword);
        //Print out the password.
        String display = app.displayPassword(password);
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

    private List<Character> getPassword(int length, int specialChar, int numNumbers) {
        Solution37 app = new Solution37();
        //take in three parameters: the length, the number of digits,
        // and the number of special characters.
        //store the characters used to make a password into an ArrayList.
        int numletters = length - specialChar - numNumbers;
        while (numletters < specialChar + numNumbers) {
            numletters++;
        }
        List <Character> password = new ArrayList<>();
        //use a random number generator to create a password.
        for (int i = 0; i < specialChar; i++) {
            password.add(app.chooseSpecial());
        }
        for (int i = 0; i < numNumbers; i++) {
            password.add(app.getDigit());
        }
        for (int i = 0; i < numletters; i++) {
            if (i % 2 == 0){
                password.add(app.chooselowerAlphabet());
            }
            else{
                password.add(app.chooseUpperAlphabet());
            }
        }
        Collections.shuffle(password);
        //Ensure that the password has as many letters as numbers and special characters.
        //return the randomly generated password.
        return password;
    }
    private String convertPassword(List <Character> password){
        StringBuilder temp = new StringBuilder();
        for (char x: password)
        {
          temp.append(x);
        }
        return temp.toString();
    }
    private char getDigit() {
        return (char) (rand.nextInt((57 - 48) + 1) + 48);
    }

    private char chooseSpecial() {
        List<Character> specialSymbol = getSymbol();
        return specialSymbol.get(rand.nextInt(specialSymbol.size()));
    }

    private char chooselowerAlphabet() {
        return (char) ((rand.nextInt(90 - 65) + 1) + 65);
    }

    private char chooseUpperAlphabet() {
        return (char) ((rand.nextInt(122 - 97) + 1) + 97);
    }

    private List<Character> getSymbol() {
        List<Character> newList = new ArrayList<>();
        char[] special = new char[32];
        for (int l = 0; l < 15; l++) {
            special[l] = (char) (33 + l);
        }
        for (int m = 15; m < 22; m++) {
            special[m] = (char) (43 + m);
        }
        for (int n = 22; n < 28; n++) {
            special[n] = (char) (69 + n);
        }
        for (int z = 28; z < 32; z++) {
            special[z] = (char) (95 + z);
        }
        for (char ch4 : special) {
            newList.add(ch4);
        }
        return newList;
    }
    private String displayPassword(String password) {
        //take in one parameter: the randomly generated password.
        //return the result.
        return "Your password is " + password;
    }

}
