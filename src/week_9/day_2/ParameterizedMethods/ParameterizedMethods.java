package week_9.day_2.ParameterizedMethods;
//05/29/2024
public class ParameterizedMethods {
    //Parameterized means to initialize the value inside the method parenthesis.

    //See the Calculator Object and Runner, where it more simplified.

    public static void main(String[] args) {
        //How to create parameterized methods
        printMessage();

        //Adding two numbers
        System.out.println("Result: " + sumOfTwoNumbers(10,20));
        printSumOfTwoNumbers(150, 260);

        System.out.println("Result: " + sumOfTwoNumbers(10,20));
        printSumOfTwoNumbers(150, 260);
    }
    public static void printMessage() {
        System.out.println("Welcome to Java class, where students are all sleepy!");
    }
    public static int sumOfTwoNumbers(int numOne, int numTwo) {
        return numOne + numTwo;
    }
    public static void printSumOfTwoNumbers(int numOne, int numTwo) {
        System.out.println(" The result of " + numOne + " + " + numTwo + " = " + sumOfTwoNumbers(numOne, numTwo));

        //In this video you can learn, how you can encapsulate and building the data and variable.
    }

}
