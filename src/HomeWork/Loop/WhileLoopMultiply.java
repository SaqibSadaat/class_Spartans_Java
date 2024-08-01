package HomeWork.Loop;

public class WhileLoopMultiply {
    public static void main(String[] args) {
        // Initialize factorial to 1
        int factorial = 1;
        // Initialize i to 1; will be used as a loop counter
        int i = 1;
        // Start a while loop that runs while i is less than or equal to 5
        while (i <= 5) {
            // Multiply factorial by i and assign the result back to factorial
            factorial = factorial * i;

            // Increment i by 1 for the next iteration
            i++;}
        // Print the final value of factorial after the loop completes
        System.out.println(factorial); //if it is print inside the loop, it will print all the value.

    }
}