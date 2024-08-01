package week_7.day_3;

public class ForLoopActivity {

    /*
    Print Array Elements
    You are given an array of integers: int[] numbers = {3, 7, 2, 8, 5};.
    Write a program using a for loop that prints the elements in the array.
    Keep a running total and add each array element to this total during each iteration of the loop.
*/
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 5};

        for (int num = 0; num < numbers.length; num++) {
            System.out.println(numbers[num]);

        }
    }



}
