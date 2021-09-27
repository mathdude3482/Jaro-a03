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
        int tableSize = 0;
       //call a multiplicationTable class that will return a 12 by 12 multiplication table.
        multiplicationTable();
    }

    private static void multiplicationTable() {
        //this function takes in one parameter: the tableSize.
        //use two for loops. Both run from 1 to tableSize, inclusive.
        //the first loop will print out the left most column.
        //the second loop will print out the products.
        //print out the multiplication table.
    }
}
