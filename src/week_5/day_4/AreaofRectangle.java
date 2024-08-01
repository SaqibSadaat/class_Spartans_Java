package week_5.day_4;

import java.util.Scanner;

public class AreaofRectangle {

    public static void main(String[] args) {
        // Write a program that calculates the area of a rectangle given its length and width.
        // Check if a number is even or odd
        int number = 15;
        var scan = new Scanner(System.in);
        number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
