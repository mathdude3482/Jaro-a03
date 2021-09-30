package baseline;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Write a program that prompts for response times from a website in milliseconds.
// It should keep asking for values until the user enters done.
//The program should print the average time, the minimum time,
// the maximum time, and the population standard deviation.
//Create functions called average, max, min, and std,
// which take in a list of numbers and return the results.
//Use loops and arrays to perform the input and mathematical operations.
//Be sure to exclude the done entry from the inputs.
//Be sure to properly ignore any invalid inputs.
//Keep the input separate from the processing and the output.
public class Solution36 {
    private static final Scanner in = new Scanner(System.in);
    private static final ArrayList<String> numbers = new ArrayList<>();
    public static void main(String[] args) {
        //Ask the user for a number. Do this in a do-while loop.
        //enter the do-while loop here.
        String data = "";
        boolean controlLoop = true;
        do{
           //get the data here.
            data = getData("Enter a number: ");
            boolean valid = checkData(data);
            if (!valid){
                //if the input is not digits or the word done, print out this message.
                System.out.println("Incorrect data. Enter again.");
            }
            else
            {
                //add the numbers into the array.
                numbers.add(data);
            }
            //if the String passed in is done:
            if (data.equalsIgnoreCase("done")){
                //remove the word done from the array.
                numbers.remove(data);
                //end the loop.
                controlLoop = false;
            }
        }while(controlLoop);
        //call the convertData function to convert the Strings into doubles.
        ArrayList <Double> newList = convertData(numbers);
        System.out.print("The numbers are: ");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
        }

        //Call the functions of the Calculate class
        //and store them into either integers or doubles.
        if(!numbers.isEmpty())
        {
            double average = Calculate.getAverage(newList);
            double min = Calculate.getMinimum(newList);
            double max = Calculate.getMaximum(newList);
            double stdev = Calculate.getstDeviation(newList, average);
            System.out.println();
            final String REPEAT = "%s%.2f%n";
            System.out.printf(REPEAT,"The average is ", average);
            System.out.printf(REPEAT,"The minimum is ", min);
            System.out.printf(REPEAT,"The maximum is ", max);
            System.out.printf(REPEAT,"The standard deviation is ", stdev);
        }
        //display the results.
    }
    //take in one parameter: the prompt.
    private static String getData(String prompt) {
        //print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextLine();
    }
    //take in one parameter: the user input.
    private static boolean checkData(String data) {
        //check if the user input is either a number or the word done.
        // Make sure to account for whitespace.
        boolean determine = true;
        String revisedData = data.replaceAll("\\s", "");
        //check if the String has any non-digits.
        String checkString = "\\D+";
        String decimal = "\\.";
        Pattern digitPattern = Pattern.compile(checkString);
        Pattern findDecimal = Pattern.compile(decimal);
        Matcher checkData = digitPattern.matcher(revisedData);
        Matcher checkData2 = findDecimal.matcher(revisedData);
        //if the user input is not done or a non-digitm return false.
        if (!(revisedData.equalsIgnoreCase("done") ||!checkData.find() || checkData2.find())){
            determine = false;
            return determine;
        }
        //otherwise, return true.
        return determine;
    }
    //take in one parameter: the ArrayList of Strings.
    private static ArrayList <Double> convertData(ArrayList <String> number) {
        //use a for loop here.
        //convert each element into a double.
        ArrayList<Double> newList = new ArrayList<>();
        try {
            for (int i = 0; i < number.size(); i++) {
                double convert = Double.parseDouble(number.get(i));
                newList.add(i, convert);
            }
        }
        catch(NumberFormatException e){
            //if the input somehow cannot convert into a double, catch it and kill the program.
            System.out.println("I'm ending the program if you somehow got this message.");
        }
        //store these doubles into an ArrayList of doubles.
        //return the new ArrayList.
       return newList;
    }
}
