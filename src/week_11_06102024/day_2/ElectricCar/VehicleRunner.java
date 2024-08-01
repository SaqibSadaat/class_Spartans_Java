package week_11_06102024.day_2.ElectricCar;

import week_11_06102024.day_2.ElectricCar.ElectricCar;

public class VehicleRunner {

    // Create an object of Electric Car
    public static void main(String[] args) {

        var tesla = new ElectricCar("Tesla", 4, "Black");
        tesla.start(); //Vehicle Parent Class
        tesla.stop(); //Car child class

        //ElectricalCar sub-child class
        tesla.chargeBattery();
        tesla.printElectricCarInfo();

    }

}
