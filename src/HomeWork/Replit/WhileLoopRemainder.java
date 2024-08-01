package HomeWork.Replit;

public class WhileLoopRemainder {
    /*
    I. Declare an integer variable i and initialize it to 1.

    II. Create a while loop.

    Set the condition to run the loop while i is less than or equal to 20.

    III. Inside the loop, check if i is even.

    If i is even, print the value of i.
    Increment i by 1.
     */
    public static void main(String[] args) {
        int i = 1;
        while(i <= 20) {
            if(i % 2 == 0) {System.out.print(i + " ");}
            i++; // i++ is inside the while loop not if statement blocks
            /*
            i++; this statement increments the value of i by 1 after each iteration of the loop.
            It ensures that the loop progresses to the next number (2, 3, 4, ..., 20) regardless
            of whether the if condition was true or false.
             */

        }
    }
}
