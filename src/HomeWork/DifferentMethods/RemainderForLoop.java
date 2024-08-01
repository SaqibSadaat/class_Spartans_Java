package HomeWork.DifferentMethods;

public class RemainderForLoop {

    /*
    I. Declare an integer variable sum and initialize it to 0.

    II. Create a for loop.

    Initialize the loop variable i to 1.
    Set the condition to run the loop while i is less than or equal to 50.
    Increment the loop variable i by 1 after each iteration.

    III. Inside the loop, check if i is even.
    If i is even, add i to sum.

    IV. After the loop, print the value of sum.

   */
    public static void main(String[] args) {
        // I. Declare and initialize sum
        int sum = 0;
        // II. Create for loop
        for(int i = 1; i <= 50; i++) {
            // III. Check if even and add to sum
            if(i % 2  == 0)
                sum += i;

        }
        // IV. Print the sum
        System.out.println("Sum of even numbers between 1 and 50 is: " + sum);
    }

}
