package week_10_06042024.lab_session.inheritance;

import week_9.day_2.Vehicle;

public class Runner {
    public static void main(String[] args) {

        // Create Object of Vehicle
        var bmwObj = new week_9.day_2.Vehicle();
        bmwObj.printVehicleInfo("BMW");

        // Create a new Object for another Vehicle
        var toyotaObj = new Vehicle();
        toyotaObj.printVehicleInfo("Toyota");

    }
}
