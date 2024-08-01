package HomeWork.DifferentMethods;

public class Appended {
    public static void main(String[] args) {
        /*
    In Java, "appending" refers to adding content to the end of an existing string or string-like object. There are two main ways to achieve this:

    String Concatenation ( + operator):

    This is a common way to combine strings. However, it's not very efficient for frequent modifications because Java creates a new String object
    every time you use the + operator. */

        String message = "Hello, ";
        message = message + "world!";  // Creates a new String object
        System.out.println(message);

    /* StringBuilder.append() method:

    This is the preferred method for efficient string manipulation. StringBuilder is a mutable class designed for appending content.
    It modifies the same object instead of creating new ones, improving performance. */

        StringBuilder messageTwo = new StringBuilder("Hello, ");
        messageTwo.append("world!");  // Modifies the existing StringBuilder object
        String finalMessage = message.toString();  // Convert to String if needed
        System.out.println(messageTwo);

   /*
    Here's a breakdown of the StringBuilder.append() method:

    append(argument): This method takes various arguments like strings, characters, integers, etc., and appends their string
    representation to the StringBuilder object. Returns: It returns a reference to the same StringBuilder object, allowing for method
    chaining (calling multiple append methods).

    Additional points:

    Java also has a similar class called StringBuffer with the same append() method. However, StringBuffer is thread-safe
    (useful for multithreaded environments) while StringBuilder is not (faster for single-threaded use).

     */
    }
}
