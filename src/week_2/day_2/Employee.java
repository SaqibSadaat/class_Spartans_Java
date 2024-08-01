package week_2.day_2;

import java.util.Scanner;

public class Employee {
    /*
     * 1: phoneNumber
     *  2: firstName
     *  3: lastName;
     *  4: salary
     *   5: city
     *
     * Print the entire information of employee
     * */

    public static void main(String[] args) {
        String phoneNumber;
        String firstName;
        String lastName;
        int salary;
        String city;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your phone Number: ");
        phoneNumber = scan.nextLine();

        System.out.print("Enter your First Name: ");
        firstName = scan.nextLine();

        System.out.print("Enter your Last Name: ");
        lastName = scan.nextLine();

        System.out.print("Enter your Salary: ");
        salary = scan.nextInt();

        System.out.print("Enter your City Name: ");
        city = scan.next();

        System.out.println("Your Phone Number is : " + phoneNumber);
        System.out.println("Your First Name is : " + firstName);
        System.out.println("Your Last Name is : " + lastName);
        System.out.println("Your Salary is : " + salary);
        System.out.println("Your City is : " + city);
    }
}
