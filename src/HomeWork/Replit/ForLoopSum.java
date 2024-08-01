package HomeWork.Replit;

public class ForLoopSum {
/*
I. Declare an integer variable sum and initialize it to 0.
II. Create a for loop.
Initialize the loop variable i to 1.
Set the condition to run the loop while i is less than or equal to 10.
Increment the loop variable i by 1 after each iteration.
III. Inside the loop, add the value of i to sum.
IV. After the loop, print the value of sum.
Expected Output:
Sum of first 10 natural numbers is: 55
 */
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 14; i++) { // This line iterates 11 times (from 0 to 10).
            sum += i; /*  Inside the loop, this line adds the current value of i to the sum variable.
                       The += operator is a shorthand for sum = sum + i.    */

//            System.out.println(sum); //if you will print here then it would be loops
        }
        System.out.println("Sum of first 10 natural numbers is: " + sum); //print out of the loop to just see the result.

    }
}
