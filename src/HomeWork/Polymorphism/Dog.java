package HomeWork.Polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound() {
//        super.makeSound(); it will also excess the parent class object.
        System.out.println("Woof!");
    }
}
