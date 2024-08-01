package HomeWork.DifferentMethods;

public class ReverseString {
    public static String reverseString(String string) { //This method takes a string argument named string.
        String reversedString = "";// It initializes an empty string variable reversedString to store the reversed characters.

        //-1 (string.length() returns the length minus 1 for zero-based indexing).
        /* i >= 0;: The loop continues as long as i is greater than or equal to 0
        (iterating until it reaches the first character). */
        /* i--: Decrements i by 1 after each iteration, moving towards the beginning of the string. */
        for (int i = string.length() - 1; i >= 0; i--) {
            /*
            reversedString += string.charAt(i);: Inside the loop, this line:
            Extracts the character at the current index i from the string using string.charAt(i).
            Appends (adds) the extracted character to the end of the reversedString using
            the += operator (shorthand for string concatenation).
             */
            reversedString += string.charAt(i);}
        /*
        After the loop finishes iterating, reversedString will contain the characters of the
        original string in reverse order.
         */
        return reversedString;
    }

    public static void main(String[] args) {
        String string = "Hello, world!";

        /*
        It calls the reverseString method, passing the string variable as an argument and
        stores the returned reversed string in the reversedString variable.
         */
        String reversedString = reverseString(string);
        System.out.println(reversedString);
    }
}
