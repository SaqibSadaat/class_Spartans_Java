package week_9.day_2;

public class EmployeeRunner {
    public static void main(String[] args) {

        // Create Object of Employee Class

        // First Employee
        var empFirstObj = new Employee();
        empFirstObj.firstName = "Afan";
        empFirstObj.lastName = "Ali";
        empFirstObj.printEmployeeInformation();

        // Second Employee
        var empTwoObj = new Employee();
        empTwoObj.firstName = "John";
        empTwoObj.lastName = "Alexander";
        empTwoObj.printEmployeeInformation();

        // Third Employee
        var empThreeObj = new Employee();
        empThreeObj.firstName = "Erin";
        empThreeObj.lastName = "Morphy";
        empThreeObj.printEmployeeInformation();

        // Fourth Employee
        //if you miss one of the variable like lastName here and
        // when you will call it, you will crash your code
        var empFourObj = new Employee();
        empFourObj.firstName = "Mathias";
//        empFourObj.lastName = "Dave";
        empFourObj.printEmployeeInformation();

//        you can also call the builtin methods too. -+
        System.out.println( empFourObj.firstName.toUpperCase() );
//        System.out.println( empFourObj.lastName.toUpperCase() ); //I call the lastName, so it will give you the Compiler error.

    }
}
