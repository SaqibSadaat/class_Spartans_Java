package week_12_06172024.lab_session.WorkingWithNumbers;

public class Main {
    // Given the following int [] numbers = { 10, 30, 50, 60, 1900, 2500, 1901, 250};
    // 1: Find the sum of the even numbers
    // 2: Find the sum of the odd numbers
    // 3: Find the sum of both even and odd numbers
    // 4: Expected out:
    // Sum of even numbers: X
    // Sum of Odd numbers: Y
    // Total: Z
    // NOTE: to design a class and use method.

    public static void main(String[] args) {

        int[] numbers = { 10, 30, 50, 60, 1900, 2500, 1901, 250 };
        var config = new Config( numbers );

        // Print result
        config.printResult();

    }

}
