package Rough.ParameterizedMethod;

public class ParameterizedFirst {
    public static void main(String[] args) {

        //Now don't need these line, when you make a method for the following line of code
//        int numOne = 20;
//        int numTwo = 30;
//        int result = numOne + numTwo;

//        int result = sumOfTwoNum(10, 20); //Call the Parameterized method and initialize the value
//        System.out.println(result); //we can still simplify the code by the following line of code.
        System.out.println("Result: " + sumOfTwoNum(10, 20));

//        sumOfTwoNumbersExample(); //Don't need this line of code because it is called in following line in print.
        System.out.println("Result: " + sumOfTwoNumbersExample());

//        printSumOfTwoNumbersExample(); //The return type for this method is void.
        printSumOfTwoNumbersExample();

    }
    public static int sumOfTwoNum(int numOne, int numTwo) { //Parameterized method (sumOfTwoNumbersExample)
        int numberOne = numOne;
        int numberTwo = numTwo;
        int result = numberOne + numberTwo;
        return result; //return the result value to the method variable (sumOfTwoNum).
    }
    /*This is int and need to return the value to the method variable and needed to print
    needed to print when you declare the method in Main() block.
   */
    public static int sumOfTwoNumbersExample() { //not parameterized method.
        int numberOne = 20;
        int numberTwo = 30;
        int result = numberOne + numberTwo;
        return result;
    }
    public static void printSumOfTwoNumbersExample() { //not parameterized method.
        int numberOne = 20;
        int numberTwo = 30;
        int result = numberOne + numberTwo;
        System.out.println("Result: " + result); //This is void and needed to print here
    }
}
