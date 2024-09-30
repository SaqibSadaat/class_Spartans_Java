package week_7.day_3;

public class EnhancedForLoopExampleThree {
    /*
    Print Array Elements
    You are given an array of integers: int[] numbers = {3, 7, 2, 8, 5};.
    Write a program using a for loop that prints the elements in the array.
    Keep a running total and add each array element to this total during each iteration of the loop.

    // NOTE: USE SCANNER TO GET THE INPUT OF THE USER
    // BASED ON THE INPUT OF THE USER, DECIDE BETWEEN PRINTING ODD OR EVEN NUMBERS

    // FOR EXAMPLE

    1. Print Even Numbers
    2. Print Odd Numbers
    Please select one of the options: X
    // if Y --> Invalid Entry, Please try again.

    if user enters 1, --> Print even numbers
    else, print odd numbers
*/

    public static void main(String[] args) {
        int oddTotal = 0;
        int evenTotal = 0;

        int[] numbers = {3, 7, 2, 8, 5};
        // Enhanced for loop to calculate totals for odd and even numbers
        for (int number : numbers) {
            if (number % 2 == 0) {  // Check if the number is even
                evenTotal += number;
            } else {  // Number is odd
                oddTotal += number;
            }
        }

        // Output the results
        System.out.println("Total of odd numbers: " + oddTotal);
        System.out.println("Total of even numbers: " + evenTotal);
    }


}

