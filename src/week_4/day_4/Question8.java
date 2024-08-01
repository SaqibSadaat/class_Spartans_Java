package week_4.day_4;

public class Question8 {
    /*
     *
     * Question 08: Problem Statement:
     * Given the string "Learning Java is fun", write a Java program to find and print the character
     * that appears exactly at the middle of the string. Assume the string length is odd.
     *
     * Expected Output: J
     *
     *
     *  */
    public static void main(String[] args) {
        String str = "Learning Java is fun";

            // Calculate the middle index (handling even and odd lengths)
            int middleIndex = str.length() / 2;
            if (str.length() % 2 == 0) {
                // Even length string - middle character is the average of the two middle characters
                middleIndex--; // Adjust to get the index of the first middle character
            }

            // Print the character at the middle index
            System.out.println("Middle character: " + str.charAt(middleIndex));
        }
}
