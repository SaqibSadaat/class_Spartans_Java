package week_11_06102024.day_1.singleInheritance;

public class Student extends Employee{
    char grade;
    String subject;

    //Constructor

    public Student(String id, String firstName, String lastName, String address, char grade, String subject) {
        super(id, firstName, lastName, address);
        this.grade = grade;
        this.subject = subject;
    }
}
