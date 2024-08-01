package Week_13_06242024.day_1;

public class AnimalRunner {
    public static void main(String[] args) {

        var dogObj = new dog();
        var fishObj = new Fish();
        var animalObj = new Animal();

        dogObj.eat();
        dogObj.makeSound();

        fishObj.eat();
        fishObj.makeSound();

        animalObj.makeSound();

    }
}
