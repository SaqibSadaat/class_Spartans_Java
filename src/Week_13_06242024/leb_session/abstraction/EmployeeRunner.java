package Week_13_06242024.leb_session.abstraction;

import Week_13_06242024.leb_session.abstraction.Employee;

public class EmployeeRunner {

        public static void main(String[] args) {

            var employeeOne = new Employee("Tony", "Alexander", 65, "Engineer");
            // employeeOne.setFirstName("Alex");
            // Print the information of the user
            employeeOne.printInfo();
        }
}
