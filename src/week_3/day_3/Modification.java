package week_3.day_3;

import java.util.Locale;

public class Modification {

    public static void main(String[] args) {
        String greeting = "Hello";
        greeting.replace("H", "J"); //There is no modification
        System.out.println(greeting);

        String greeting2 = "Hello";
        greeting2 = greeting2.replace("H", "J"); //Now it is modified
        System.out.println(greeting2);



        String lastName = "Tony";
        lastName.toUpperCase(); //There is no modification
        System.out.println(lastName);

        String firstName = "Tony";
        firstName = firstName.toUpperCase(); //Now it is modified
        System.out.println(firstName);

    }
}
