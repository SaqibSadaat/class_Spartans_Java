package week_12_06172024.day_1;

public class Employee {

    public String firstName, lastName, dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getDateOfBirth() {return dateOfBirth;}
    private void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}
    private void setFirstName(String firstName) {this.firstName = firstName;}
    private void setLastName(String lastName) {this.lastName = lastName;}

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

}
