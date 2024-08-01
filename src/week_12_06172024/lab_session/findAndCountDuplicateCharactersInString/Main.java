package week_12_06172024.lab_session.findAndCountDuplicateCharactersInString;

public class Main {
    // String message = "Hello World";
    // Design a method which will expect a string and a character to look for in a string
    // and return the number occurrence of the character in the string.

    public static void main(String[] args) {
        String message = "Hello World";
        char characterToFind = 'o';
        int numberOccurrences = CharacterCounter.countCharacterOccurrences(message, characterToFind);
        System.out.println("The character '" + characterToFind + "' appears " + numberOccurrences + " times in the string '" + message + "'.");
    }

    /*
    Explanation:

    CharacterCounter Class:
        This class contains a static method countCharacterOccurrences.

    countCharacterOccurrences Method:
        This method takes two arguments: a string (message) and a character (character) to search for.
        It initializes a variable count to 0 to accumulate the occurrences.
        It iterates through each character (ch) in the message string using a for-each loop.
        Inside the loop, it checks if the current character (ch) is the same as the character to
        find (character) using ch == character. If it is, it increments the count variable.
        The method returns the final count, indicating the number of occurrences of the character in the string.

    Main Class:
        This class demonstrates how to use the countCharacterOccurrences method.
        It creates a string message and a character characterToFind.
        It calls the countCharacterOccurrences method, passing the string and character.
        The returned count is stored in numberOccurrences.
        Finally, it prints a message to the console indicating the character, its count, and the original string.

This code effectively addresses the prompt, providing a reusable method for counting character occurrences and clear output formatting.
     */

}
