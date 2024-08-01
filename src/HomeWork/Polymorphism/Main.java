package HomeWork.Polymorphism;

public class Main {
    public static void main(String[] args) {
        var dogObj = new Dog();
        dogObj.makeSound(); //All the object have the same makeSound variable. It is overridden .

        var animalObj = new Animal();
        animalObj.makeSound();

        var catObj = new Cat();
        catObj.makeSound();

         /*
        In this example, makeSound is overridden in the Dog class to provide a specific sound for a dog and cat.
        When calling makeSound on an Animal reference that actually points to a Dog or Cat object, polymorphism
        ensures the correct Dog.makeSound or Cat.makeSound method is executed at runtime.
         */
    }
}
