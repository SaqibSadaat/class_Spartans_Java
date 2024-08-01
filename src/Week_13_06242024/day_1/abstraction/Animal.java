package Week_13_06242024.day_1.abstraction;

public abstract class Animal {
    // Fields
    String name;
    int age;
    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
    public abstract void makeSound();
}
