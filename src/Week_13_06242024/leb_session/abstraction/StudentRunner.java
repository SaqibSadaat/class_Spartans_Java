package Week_13_06242024.leb_session.abstraction;

import Week_13_06242024.leb_session.abstraction.Employee;
import Week_13_06242024.leb_session.abstraction.Student;

public class StudentRunner {

    public static void main(String[] args) {


        var studentOne = new Student("Alex", "alex lastName", 19, "Engineer");
        var employeeObj = new Employee("Tony", "morphy", 49, "Automation Engineer");

        studentOne.printInfo();
        employeeObj.printInfo();

    }
}
