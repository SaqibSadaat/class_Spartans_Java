package HomeWork.Replit;

public class ForLoopMultiply {
    /*
I. Declare an integer variable factorial and initialize it to 1.
II. Declare an integer variable n and initialize it to a value (e.g., 5).
III. Create a for loop.
Initialize the loop variable i to 1.
Set the condition to run the loop while i is less than or equal to n.
Increment the loop variable i by 1 after each iteration.

IV. Inside the loop, multiply factorial by i.
V. After the loop, print the value of factorial.
Expected Output (for n = 5):
Factorial of 5 is: 120
     */
    public static void main(String[] args) {

        int factorial = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println("Factorial of 5 is: " + factorial); //it will loop if you print inside the loop

        }
        System.out.println( "* * * * * * * * * * * * * * * * * * * * ");
        System.out.println("Factorial of 5 is: " + factorial); //will see the last result if printed out of the loop
    }
}
