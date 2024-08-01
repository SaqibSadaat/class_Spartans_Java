package HomeWork.Loop;

public class DoWhileLoop {
    // When a loop is going to run?
    // When the condition is true
    public static void main(String[] args) {
/*        // Initialization
        do {
            // Initialization
            // Iteration
        } while ( condition );

        */
        // Print a student Name based on the condition 5 times
        for (int attempts = 1; attempts < 1; attempts++) {
            System.out.println("Bob");
        }

        // Using do while loop
        int attempts = 1;
        do {
            System.out.println("Bob");
            attempts++;
        } while (attempts <= 5);
    }
}
