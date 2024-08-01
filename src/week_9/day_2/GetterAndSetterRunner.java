package week_9.day_2;

public class GetterAndSetterRunner {
    public static void main(String[] args) {

        // Create Object of Employee Class
        var empObj = new GetterAndSetter();
        empObj.setFirstName("John");
        empObj.setLastName("Doe");
        empObj.printEmployeeInformation(); //call the method's-variable to print the information

    }
}
