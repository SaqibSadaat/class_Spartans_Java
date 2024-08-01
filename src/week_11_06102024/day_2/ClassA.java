package week_11_06102024.day_2;

public class ClassA {
    String firstName;
    String lastName;

    public ClassA(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
    }
}
