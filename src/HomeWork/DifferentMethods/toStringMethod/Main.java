package HomeWork.DifferentMethods.toStringMethod;

public class Main {
    /*
    Explanation of the code:

    We define a Student class with private fields name and age.
    A constructor initializes these fields.
    We override the toString() method with the @Override annotation.
    Inside toString(), we use string concatenation to create a String containing the
    student's name and age enclosed in quotes.
     */
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        System.out.println(student1); // Prints Student [name='Alice', age=20]
    }
    /*
    This is a much more informative representation of the Student object compared to the default class name
    and hashcode.

    In summary,
    The toString() method is a crucial part of object-oriented programming in Java. By overriding it, you can create
    clear and informative string representations of your objects, enhancing code readability, debugging, and working
    with collections.

     */
}
