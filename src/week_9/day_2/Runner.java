package week_9.day_2;

public class Runner {
    // Method {
    // // Body
    // }
    // We cannot make one method inside another method, but we can call one method inside another method
    public static void main(String[] args) {
        // Built-In methods
        String fullName = "John Doe";
        System.out.println(fullName.length());

        // Call User Defined method
        // nameOfYourMethod();
        printNumbersFromOneToTen();
    }

    //Designing of method
    //Name of the method, and it can be anything, but it should be descriptive.
    //void is return type, but we can use other return type like int, boolean, char etc.
    //which will return some specified data.
    //public is access modifier
    //static means you can access the mentioned variable anywhere inside the current class.

    public static void printNumbersFromOneToTen() {
        // Body of method
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
    }
}
