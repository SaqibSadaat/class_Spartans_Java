package week_11_06102024.day_3;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Hello World";
        printReverseString(str); //printReverseString(str);: Calls the printReverseString method, passing the str variable as an argument.
                                // This line executes the code for reversing the string.
    }

    //This is another public method that doesn't return any value (void). It takes a String object named str as an argument.
    // This method is responsible for reversing the string and printing the reversed version.
    public static void printReverseString(String str) {
        String reverseVersion = ""; //This variable will store the reversed string.
        for (int index = str.length() - 1; index >= 0; index--) {//returns the length of the string, minus 1 to account
                                                                 //for zero-based indexing.

            /*This line extracts the character at the current index (index) from the str string using str.charAt(index).
            The extracted character is then appended to the reverseVersion string using the += operator. This builds
            the reversed string character by character. */
            reverseVersion += str.charAt(index);  //This is inside the loop, and each word from the string value will
                                                  // be iterated and will store in reverseVersion variable.
        }
        //you can not print inside the loop
        System.out.println(" Reversed Version of " + str + " is = " + reverseVersion);
    }

}
