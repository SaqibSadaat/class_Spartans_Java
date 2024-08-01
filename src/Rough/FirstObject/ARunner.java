package Rough.FirstObject;

import Rough.FirstObject.A;

public class ARunner {
    public static void main(String[] args) {
        var firstPerson = new A("Saqib", "Ali", 40);
        var secondPerson = new A("Benazira", "Sadaat", 30);
        A thirdPerson = new A("Imaan", "Ali", 12);

        System.out.println("First Person Information: ");
        firstPerson.printInfo();
        secondPerson.printInfo();
        thirdPerson.printInfo();



    }
}
