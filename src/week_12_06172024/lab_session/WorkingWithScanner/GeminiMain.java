package week_12_06172024.lab_session.WorkingWithScanner;

public class GeminiMain {
    public static void main(String[] args) {
        int size = GeminiUserInput.getArraySize();
        String[] usernames = GeminiUserInput.getUsernames(size);

        GeminiUsernameManager manager = new GeminiUsernameManager(usernames);
        manager.displayUsernames();

        /*
        Explanation:

     1. UserInput Class:
     -- getArraySize method prompts the user for the array size and returns the entered value.
     -- getUsernames method takes the array size and creates a string array. It then prompts
        the user for usernames in a loop, filling the array elements.

     2. UsernameManager Class:
     -- This class has a private string array usernames to store the usernames.
     -- The constructor takes a string array as input and assigns it to the internal usernames array.
     -- displayUsernames method iterates through the usernames array and prints each non-null
        element (avoiding empty elements).

     3. Main Program:
     -- The main method calls UserInput.getArraySize to get the array size from the user.
     -- It then calls UserInput.getUsernames to get the usernames and store them in an array.
     -- An instance of UsernameManager is created, passing the retrieved usernames.
     -- Finally, the displayUsernames method of the UsernameManager is called to print the
        stored usernames.

     This program demonstrates separating user input logic and username management into
     distinct classes for better organization and reusability.
         */
    }
}
