package week_8_Loop.day_4;

public class ApplyFiltersToStringReplaceAllMethod {
    static String message = "Welcome TO TekSchool Java IS EASY! 123*&^^%^%%!@#)_!@#@#)!(*@$)(*!asdljhasdjklh";  //now message is static variable access everywhere.

    //This problem was solved by different methods
    // Get the characters only, Both UpperCase & LowerCase
    // Get the numbers only
    // Get the Symbols only or Special Characters
    // Get the LowerCase Characters only
    // Get the UpperCase Characters only
    public static void main(String[] args) {

        // Get the characters only, Both UpperCase & LowerCase
        System.out.println(message.replaceAll("[^a-zA-Z]", "")); //remove all except a-z and A-Z

        // Get the numbers only              //regex means regular expression.
        System.out.println(message.replaceAll("[^0-9]", "")); //^ is not operator i.e. remove all except 0-9

        // Get the Symbols only or Special Characters
        System.out.println(message.replaceAll("[a-zA-Z0-9]", ""));
        System.out.println(message.replaceAll("[a-zA-Z0-9]", "").replace(" ", "")); //How to remove spaces as well.

        // Get the LowerCase Characters only
        System.out.println(message.replaceAll("[^a-z]", ""));
        
        // Get the UpperCase Characters only
        System.out.println(message.replaceAll("[^A-Z]", ""));






    }


}