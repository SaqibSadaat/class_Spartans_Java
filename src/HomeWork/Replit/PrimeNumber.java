package HomeWork.Replit;

public class PrimeNumber {
    public static void main(String[] args) {
        // Outer loop iterates from 2 to 50
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true; //If you assign to false the inner loop will not be checked.
            /*
           This line declares a boolean variable named isPrime and initializes it to true.
           This variable will be used as a flag to track whether the current value of i
           (being checked in the outer loop) is a prime number.
            */

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
        /*
    1. Outer Loop: Iterates from i = 2 to i <= 50 using a for loop.
    2. Inner Loop: Within the outer loop, another for loop iterates from j = 2 to j < i. This
        checks potential divisors of i.
    3. Divisibility Check: Inside the inner loop, it checks if i is divisible by j using the modulo
        operator (%). If it is, it sets the isPrime flag to false and breaks out of the inner loop using break.
    4. Prime Number Printing: After the inner loop completes, if isPrime remains true, it means i wasn't
        divisible by any numbers in the inner loop, and hence it's prime. So, it prints the value of i.
         */
    }
}
