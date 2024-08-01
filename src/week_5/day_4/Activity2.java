package week_5.day_4;

import java.util.Scanner;

public class Activity2 {



    // Write a program to find the maximum of three numbers using conditional statements.

    public static void main(String[] args) {



        // Calculate area of a rectangle
        int length = 5;
        int width = 3;

        int area = length * width;

        System.out.println("Area of rectangle: " + area);

        // Find the maximum of three numbers
        int num1 = 7;
        int num2 = 12;
        int num3 = 4;

        int max = num1; // Assume num1 is max initially

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("Maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);

    }
}
