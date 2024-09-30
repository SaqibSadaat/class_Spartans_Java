package HomeWork.Loop;

import java.util.Scanner;

public class EnhancedLoopWithScanner {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {3, 7, 2, 8, 5};
        Scanner scanner = new Scanner(System.in);

        // Ask the user to select an option
        System.out.println("1. Print Even Numbers");
        System.out.println("2. Print Odd Numbers");
        System.out.print("Please select one of the options: ");

        int choice = scanner.nextInt();  // Get user input

        // Initialize a running total
        int total = 0;

        // Handle the user's choice
        if (choice == 1) {
            System.out.println("Even Numbers:");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);  // Print even numbers
                    total += number;
                }
            }
            System.out.println("Total of even numbers: " + total);
        } else if (choice == 2) {
            System.out.println("Odd Numbers:");
            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.println(number);  // Print odd numbers
                    total += number;
                }
            }
            System.out.println("Total of odd numbers: " + total);
        } else {
            // Invalid choice handling
            System.out.println("Invalid Entry, Please try again.");
        }

        scanner.close();
    }
}
