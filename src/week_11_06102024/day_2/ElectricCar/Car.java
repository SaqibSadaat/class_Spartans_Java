package week_11_06102024.day_2.ElectricCar;

public class Car extends Vehicle {
    int numberOfDoors;
    String color;

    //Constructor
    public Car(String companyName, int numberOfDoors, String color) {
        super(companyName);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    //Method
    public void stop() {
        System.out.println("Car Stopped!");
    }

}
