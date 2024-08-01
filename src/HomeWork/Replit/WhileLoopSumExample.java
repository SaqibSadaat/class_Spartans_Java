package HomeWork.Replit;

public class WhileLoopSumExample {
    public static void main(String[] args) {
        /*
        I. Declare an integer variable sum and initialize it to 0.

        II. Declare an integer variable i and initialize it to 1.

        III. Create a while loop.
        Set the condition to run the loop while i is less than or equal to 10.

        IV. Inside the loop, add the value of i to sum and increment i by 1.

        V. After the loop, print the value of sum.
        Expected Output:
        Sum of first 10 natural numbers is: 55
         */
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i; //// Add the current value of i to sum
            i++;
    }
        System.out.println("Sum of first 10 natural numbers is: " + sum);

        /*
        While Loop:
        while (i <= 10) { ... } specifies a loop that continues as long as i is less than or equal to 10.

        Loop Body:

        sum += i; adds the current value of i to sum. This accumulates the sum of the first i natural numbers.
        i++; increments i by 1 after each iteration, ensuring the loop progresses to the next natural number.
         */
}
}
