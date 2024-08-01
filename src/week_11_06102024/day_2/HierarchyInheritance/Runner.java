package week_11_06102024.day_2.HierarchyInheritance;

public class Runner {
    public static void main(String[] args) {

        // Create an object of car
        var carObj = new Car();
        // Create an object of motorcycle
        var motorcycle = new Motorcycle();

        carObj.startEngine();
        carObj.stopEngine();

        carObj.playRadio();


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  ");

        motorcycle.startEngine();
        motorcycle.stopEngine();

        motorcycle.popWheelie();


    }

}
