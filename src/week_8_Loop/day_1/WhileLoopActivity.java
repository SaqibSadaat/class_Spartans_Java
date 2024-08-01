package week_8_Loop.day_1;

import java.util.Scanner;

public class WhileLoopActivity {
    public static void main(String[] args) {

        /*
         * Ask the user for a number
         *  Print the multiplication table using while loop
         *   from start to endPoint
         *   Where start and end are numbers entered by the user
         *
         *  */

        var scanner = new Scanner(System.in);

        // Get user input for start and end points
        System.out.print("Enter the starting number for the multiplication table: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number for the multiplication table: ");
        int end = scanner.nextInt();

        // Validate user input (optional)
        if (start > end) {
            System.out.println("Start number should be less than or equal to the end number.");
            return; // Exit the program if input is invalid
        }

        // Print the multiplication table
        int number = start;
        while (number <= end) {
            System.out.println("Multiplication table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
            number++;
        }

        scanner.close();



    }
}
