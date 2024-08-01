package Week_13_06242024.leb_session.abstraction;

import Week_13_06242024.leb_session.abstraction.Employee;

public class Student extends Employee {

    public Student(String firstName, String lastName, int age, String occupation) {
        super(firstName, lastName, age, occupation);
    }

    @Override
    public void printInfo() {
        System.out.println("Student FirstName: " + getFirstName());
        System.out.println("Student LastName: " + getLastName());
        System.out.println("Student age: " + getAge());
        System.out.println("Student Occupation: " + getOccupation());
    }

}
