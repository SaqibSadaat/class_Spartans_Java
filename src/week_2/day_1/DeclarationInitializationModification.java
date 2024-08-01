package week_2.day_1;

import javax.swing.*;

public class DeclarationInitializationModification {
    public static void main(String[] args) {
        String firstName; //Declaration
        String lastName;
        String middleName;

        firstName = "Saqib"; //Initialization
        lastName = "Sadaat";
        middleName = "Ali";

        middleName = "null"; //Modification

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(middleName);

        System.out.println(middleName = middleName = "Jan"); // you can also modify this way

        int x; //Declaration
        x = 10; //Initializing
        x = 20; //modified
        System.out.println(x);

        System.out.println(x = x - 5); //You can modify this way. Now the value of "x" is 15.
        System.out.println(x);



    }
}
