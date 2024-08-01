package week_10_06042024.day_2.RandomNumbersProcessor;

import java.util.Scanner;

public class RandomNumberGenerator {
    // Design a class which is going to have a method to generate random numbers
    // Store random numbers in an array
    // And then print even numbers from this array
    // the array size should be set from a value being passed from a user!

    //Only one method should be public, which is the start point,
    //The rest should be private!
    private static final int MAX_VALUE = 100; // Maximum random number (you can adjust this)

    private static int[] generateRandomNumbers(int arraySize) {
        int[] randomNumbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            randomNumbers[i] = (int) (Math.random() * MAX_VALUE); // Generate random number between 0 (inclusive) and MAX_VALUE (exclusive)
        }
        return randomNumbers;
    }

    private static void printEvenNumbers(int[] numbers) {
        System.out.println("Even numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline after printing even numbers
    }

    public static void main(String[] args) {
        int arraySize;

        // Get array size from user (assuming user input is valid)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the desired array size: ");
        arraySize = scanner.nextInt();

        int[] randomNumbers = generateRandomNumbers(arraySize);
        printEvenNumbers(randomNumbers);

        scanner.close(); // Close the scanner resource
    }
}
