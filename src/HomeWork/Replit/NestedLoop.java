package HomeWork.Replit;

public class NestedLoop {

    /*
    I. Create a for loop to iterate from 2 to 50.

    Initialize the loop variable i to 2.
    Set the condition to run the loop while i is less than or equal to 50.
    Increment the loop variable i by 1 after each iteration.

    II. Inside the loop, create another for loop to check if i is prime.

    Initialize the loop variable j to 2.
    Set the condition to run the loop while j is less than i.
    Increment the loop variable j by 1 after each iteration.

    III. Check if i is divisible by j.

    If it is, set a flag to false and break the inner loop.
    If the flag remains true after the inner loop, print i.
     */

    public static void main(String[] args) {
        // Outer loop iterates from 2 to 50
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;

            // Inner loop checks if i is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print prime numbers
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
