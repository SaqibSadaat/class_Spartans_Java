package week_9.day_1;

public class UserRunner {

    public static void main(String[] args) {

        var stdFirstObj = new UserInformation();
        stdFirstObj.id = 101;
        stdFirstObj.firstName = "Saqib";
        stdFirstObj.lastName = "Ali";
        stdFirstObj.gender = 'M';
        stdFirstObj.dateOfBirth = "01/01/1990";
        stdFirstObj.occupation = "Tester";
        stdFirstObj.printUserInformation();

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * ");

        var stdSecondObj = new UserInformation();
        stdSecondObj.id = 201;
        stdSecondObj.firstName = "John";
        stdSecondObj.lastName = "Doe";
        stdSecondObj.gender = 'F';
        stdSecondObj.dateOfBirth = "01/01/1990";
        stdSecondObj.occupation = "QA";
        stdSecondObj.printUserInformation();



    }

}
