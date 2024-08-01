package week_5.day_4;

public class SwapTwoVariables {

    public static void main(String[] args) {

        // Write a Java program to swap two variables without using a third variable.

        // Swap two variables without a third variable
        int x = 70;
        int y = 30;
        System.out.println("Before swap: x = " + x + ", y = " + y);

        x = x + y; // Add y to x (x value is 100 now)
        y = x - y; // y = 100 - 30 = 70 (now y value is 70)
        x = x - y; // x = 100 - 70 = 30
        System.out.println("After swap: x = " + x + ", y = " + y);

    }
}
