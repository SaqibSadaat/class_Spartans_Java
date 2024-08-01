package HomeWork.DifferentMethods.toStringMethod;

public class toStringMethodExplanation {

    /*
    Imagine you have a box (object) filled with stuff (data) but the outside just has a label saying
    "Box" (default toString).

    The toString() method in Java is like adding a sticker to the box that describes what's inside.

    By default, it's just a boring label saying "Box" which isn't very helpful.
    You can create a custom sticker (override toString) that lists the contents (data) of the box in
    a clear way, like "This box has books, toys, and a game!"

    Here's why this sticker (toString) is useful:

    Knowing what's inside: When you need to peek at the box (debug the program), the sticker tells you
    what's there without opening it (modifying the object).
    Sharing the contents: If you want to tell someone what's in the box (log information), the
    sticker provides a clear description.
    Keeping track of boxes: If you have many boxes (objects in a collection), the stickers help
    you identify them easily.

    In short, toString() helps turn your objects from mysterious boxes into clearly labeled ones,
    making your code easier to understand and work with!

    toString method is also used to convert mutable String to immutable String and we will have
    access to all methods of immutable String

                          ************************************************

    Is this right that toString(); can be used instead of print method?
    No, toString() itself doesn't directly print anything. It's  used to convert an object into a String
    representation, but it doesn't handle the printing functionality.  Here's a breakdown of the differences:

    toString()

    Purpose: Converts an object into a String representation.
    Functionality: Provides a human-readable description of the object's fields and values.
    Doesn't print: It doesn't directly print the String to the console.
    Use case: Often used in conjunction with printing methods like System.out.println(). When you
    use System.out.println(object), Java calls the object's toString() method to get the String
    representation before printing it.

a
    Purpose: Prints the provided information to the console or output stream.
    Functionality: Can print various data types like strings, numbers, or objects.
    Prints directly: It takes care of sending the data to the console or designated output stream.
    Can use toString(): You can use System.out.println(object.toString()) to explicitly convert the
    object to a String using toString() and then print it.

    Here's an analogy:

    Think of toString() as a function that translates an object into a written description (String).
    The print methods are like messengers that take the written description (String) and deliver it to the
    console (output destination).

    In essence, you can leverage toString() to create a String representation of an object, and then use
    print methods to display that String on the console or other output locations.
     */

}
