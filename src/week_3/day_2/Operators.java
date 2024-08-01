package week_3.day_2;

public class Operators {

    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 20;
        int result = numOne + numTwo;

        System.out.println(result);
        System.out.println("Result: " + numOne + numTwo); // result is Result: 1020 because it is Concatenating not addition

        System.out.println("Result: " + (numOne + numTwo)); // The compiler will solve the parenthesis first and then give you the result.
        System.out.println("Result: " + numOne * 2 ); //For multiplication, Subtraction, and for Division, we don't need to put parenthesis.
                                                        // or have rules like addition.

        // X is the numOne
        // Y is the numTwo
        // Z is the result of numOne and numTwo

        //The sum of X + Y = Z
        System.out.println("The sum of " + numOne + " + " + numTwo + " = "  + result);

        System.out.println(150 + 20 + "String" + 50);

        String firstName = "Saqib";
        String lastName = "Sadaat";
        int salary = 450000;
        System.out.println(firstName+lastName+salary);





    }
}
