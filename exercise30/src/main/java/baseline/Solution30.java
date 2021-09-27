package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
//Use a nested loop to complete this program.
//Align each column within the table without using the tab character.
public class Solution30 {
    public static void main(String[] args) {
       //declare a int variable tableSize. Set it to 12.
        int tableSize = 12;
       //call a multiplicationTable class that will return a 12 by 12 multiplication table.
        multiplicationTable(tableSize);
    }

    private static void multiplicationTable(int tableSize) {
        //this function takes in one parameter: the tableSize.
        //use two for loops. Both run from 1 to tableSize, inclusive.
        //this loop determines the left most column of the multiplication table.
        for (int y = 1; y <= tableSize; y++){
            System.out.print("\n");
            //This loop calculates the rest of the multiplication table.
            for (int z = 1; z <= tableSize; z++){
                //call the multiply function to calculate the product.
                System.out.format("%4d", multiply(y,z));
            }
        }
        //print out the multiplication table.
        System.out.println();
    }

    public static int multiply(int x, int y){
        //take in two parameters: two integers.
        //Return the product of the two integers.
        return x * y;
    }
}
