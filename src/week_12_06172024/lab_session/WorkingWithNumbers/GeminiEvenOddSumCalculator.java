package week_12_06172024.lab_session.WorkingWithNumbers;

public class GeminiEvenOddSumCalculator {

    /*
    // Given the following int[] numbers = { 10, 30, 50, 60, 1900, 2500, 1901, 250 };
    // 1: Find the sum of the even numbers
    // 2: Find the sum of the odd numbers
    // 3: Find the sum of both even and odd numbers
    // 4: Expected Out:
    // Sum of even numbers: X
    // Sum of odd numbers: Y
    // Total: Z
    // NOTE: to design a class and use method.
     */
    public static void main(String[] args) {
        int[] numbers = {10, 30, 50, 60, 1900, 2500, 1901, 250};
        int[] sums = calculateEvenOddSums(numbers);

        System.out.println("Sum of even numbers: " + sums[0]);
        System.out.println("Sum of odd numbers: " + sums[1]);
        System.out.println("Total: " + (sums[0] + sums[1]));
    }

    public static int[] calculateEvenOddSums(int[] numbers) {
        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        return new int[]{evenSum, oddSum};
    }
    /*
    Explanation:

    EvenOddSumCalculator Class: This class encapsulates the logic for calculating even and odd number sums.

    main Method:
     -- Declares an integer array numbers with sample data.
     -- Calls the calculateEvenOddSums method, passing the numbers array as an
        argument. This method calculates the sums and returns an integer array containing the even and odd sums.
     -- Prints the even sum, odd sum, and total sum using the returned values from the method.

    calculateEvenOddSums Method:
     -- Takes an integer array numbers as input.
     -- Initializes two integer variables evenSum and oddSum to 0, which will accumulate
        the sums of even and odd numbers, respectively.
     -- Uses a for-each loop to iterate through each element (number) in the numbers array.

        Inside the loop:
     -- Checks if the current number is even using the modulo operator (%). If it's
        even (number % 2 == 0), adds it to evenSum. Otherwise, adds it to oddSum.
     -- Returns an integer array containing evenSum at index 0 and oddSum at index 1.

     */
}
