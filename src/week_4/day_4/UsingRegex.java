package week_4.day_4;

public class UsingRegex {

    public static void main(String[] args) {
        String str2 = "btGnPi9K06#*&kkasd12312456";
        System.out.println(str2);

// btGnPi9K06#*&kkasd12312456
// GP9K06#*&12312456
// btnikkasd
// 90612312456
// #*&

//Get only upperCase characters instead of lowerCase characters
        System.out.println(str2.replaceAll("[a-z]", ""));

// Get only lowerCase characters instead of upperCase characters
        System.out.println(str2.replaceAll("[^a-z]", ""));

// Get only the numbers instead of lower and upper case characters and special characters
        System.out.println(str2.replaceAll("[^0-9]", ""));


// All special character are going to be printed into the console
        System.out.println(str2.replaceAll("[a-zA-Z0-9\\s]", ""));


        int a = 10;
        int b = 20;
//        System.out.println(a * -

        System.out.println("Result: " + 2 + 3); // it is concatenating not adding.
        System.out.println("Result: " + (2 + 3)); //now it is adding

//        System.out.println("Result: " (2 - 3 );
    }
}
