package Week_13_06242024.day_1.Excercise;

public class calculator {

    // Method Overloading

    //The code demonstrates method overloading, but it doesn't fully embrace other OOP concepts:

    public int sum(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public int sum(int numOne, int numTwo, int numThree) {
        return numOne + numTwo + numThree;
    }
    public void printSum(){

        /*
        The overloading in this code is within the

        sum methods of the calculator class.

        Here's why:

        Overloading in Java refers to the ability of methods to have the same name but different parameter
        lists (number, type, or order of arguments).
        In this code, you have two sum methods:
        * The first sum method takes two integer arguments (numOne and numTwo).
        * The second sum method also takes the name sum but has three integer arguments (numOne, numTwo, and numThree).
         */
        

    }
}
