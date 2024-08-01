package week_7.day_4;

import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        var scnObj = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scnObj.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println((int) celsius + " degrees Celsius is equal to " + (int) fahrenheit + " degrees Fahrenheit.");

    }
}
