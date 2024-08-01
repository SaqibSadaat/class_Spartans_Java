package week_6.day_2;

import java.util.Scanner;

public class SwitchStatementActivity {
    public static void main(String[] args) {
        String firstName, lastName, dateOfBirth;

        var scnObj = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        firstName = scnObj.nextLine();

        System.out.print("Enter your Last Name: ");
        lastName = scnObj.nextLine();

        System.out.print("Enter your Date of Birth: ");
        dateOfBirth = scnObj.nextLine();

        System.out.println("F/Name is: " + firstName + " L/Name is: " + lastName + " DOB: " + dateOfBirth);



    }
}
