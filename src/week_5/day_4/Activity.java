package week_5.day_4;

import java.util.Scanner;

public class Activity {
    // Get the first and last name of the user
    // compare the first and last name if they're equal to each other
    // if yes, --> your first and last name is the same
    // if no, --> your first and last name is not the same.


    public static void main(String[] args) {

        // Declare variables
        String firstName;
        String lastName;

        // Create object of scanner to get the user input
        var scan = new Scanner(System.in);
        //for remove the duplication like Scanner, you can use "var" keyword for objects not for local variable.
        System.out.print("Enter your firstName: ");
        firstName = scan.next();
        System.out.print("Enter your lastName: ");
        lastName = scan.next();

        if (firstName.equals(lastName)) {
            System.out.println("your first and last name are the same");
        } else {
            System.out.println("your first and last name are not the same.");
        }

    }
}
