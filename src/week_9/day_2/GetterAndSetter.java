package week_9.day_2;

public class GetterAndSetter {
    // First Employee
    private String firstName;
    private String lastName;

    public void printEmployeeInformation() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + lastName);
    }
    // Getters & Setters
    //when you private your variable you need to use Get and Set methods to access them.
    public String getFirstName() {
        return firstName;
    }

    // Setters
    // (Setters) are like checkpoint to scan the data.

    //It means that whenever you call this method, you need to pass a new name.
    //This new name will be transferred to the first name and that is basically the job of this method.
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        firstName = newLastName;

        //we can also make the Getter and Setter private

    }
}