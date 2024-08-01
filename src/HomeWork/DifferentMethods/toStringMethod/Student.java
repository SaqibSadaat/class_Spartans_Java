package HomeWork.DifferentMethods.toStringMethod;

public class Student {
    /*
    What is toString()
    The toString() method is a built-in method in Java that almost all classes inherit from the parent class Object.
    It's used to get a human-readable string representation of an object.

    Why is it important?
    By default, the inherited toString() method in Object simply returns the class name and a hashcode, which isn't
     very informative. Overriding toString() in your classes allows you to customize how your objects appear as strings.
     This becomes helpful in various scenarios:

    Debugging: When you print an object during debugging (System.out.println(objectName)), Java calls toString() to
    display its contents in a readable format.
    Logging: Logging frameworks often rely on toString() to represent objects within log messages.
    Collections: Collections like ArrayList or HashMap use the toString() method of their elements to represent the
    collection's contents as a string.
     */
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Student(String name, int age) {this.name = name;this.age = age;}
    // Override toString() to provide a meaningful representation
    @Override
    public String toString() {
        return "Student [name='" + name + '\'' + ", age=" + age + "]";
    }
}
