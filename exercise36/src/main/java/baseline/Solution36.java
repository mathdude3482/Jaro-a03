package baseline;

import java.util.ArrayList;
import java.util.Scanner;

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
    private static ArrayList<Double> numbers = new ArrayList<>();
    private static boolean state1 = true;

    public static void main(String[] args) {
        Calculate myCalculate = new Calculate();
        //create a double called temp to store the data.
        double temp;
        do {
            //store data until state1 becoes false.
            temp = convertData();
            if (temp != 0) {
                numbers.add(temp);
            }
        } while (state1);
        System.out.print("The numbers are: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
        }

        //Call the functions of the Calculate class
        //and store them into either integers or doubles.
        if (!numbers.isEmpty()) {
            double average = myCalculate.getAverage(numbers);
            double min = myCalculate.getMinimum(numbers);
            double max = myCalculate.getMaximum(numbers);
            double stdev = myCalculate.getstDeviation(numbers, average);
            System.out.println();
            final String REPEAT = "%s%.2f%n";
            System.out.printf(REPEAT, "The average is ", average);
            System.out.printf(REPEAT, "The minimum is ", min);
            System.out.printf(REPEAT, "The maximum is ", max);
            System.out.printf(REPEAT, "The standard deviation is ", stdev);
        }
        //display the results.
    }

    //take in one parameter: the ArrayList of Strings.
    private static double convertData() {
        //use a for loop here.
        //convert each element into a double.
        do {
            try {
                System.out.println(" What is your input?");
                String temp = in.nextLine();
                if (temp.equalsIgnoreCase("done")) {
                    state1 = false;
                    return 0;
                } else {
                    return Double.parseDouble(temp);
                }
            } catch (NumberFormatException e) {
                //if the input somehow cannot convert into a double, catch it and kill the program.
                System.out.println("Invalid answer.");
            }
        } while (true);
        //store these doubles into an ArrayList of doubles.
        //return the new ArrayList.
    }
}
