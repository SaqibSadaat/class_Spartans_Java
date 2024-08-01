package week_6.day_4;

import java.util.Scanner;

public class ActivityFour {

     /*
* Age Group Classification

Objective: Classify individuals into age groups based on their age.

You're designing a system that categorizes individuals into age groups:
*  Child (0-12),
* Teenager (13-19),
* and Adult (20 and above).
A user provides their age: int userAge = 15; (This value can be changed for testing).
Determine the user's age group.
Print out the age group of the user.
* */

    public static void main(String[] args) {
        int userAge;
        String ageGroup;

        var scnObj = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        userAge = scnObj.nextInt();

        if (userAge >= 0 && userAge <= 12) {
            ageGroup = "Child";
        } else if (userAge >= 13 && userAge <= 19) {
            ageGroup = "Teenager";
        } else {
            ageGroup = "Adult";
        }

        System.out.println("User Age: " + userAge);
        System.out.println("Age Group: " + ageGroup);

    }

}
