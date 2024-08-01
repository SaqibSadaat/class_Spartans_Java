package week_10_06042024.day_1;


public class StudentRunner {
    static String firstName;

    public static void main(String[] args) {
        // AAA --> Arrange, Act, Assert
        // Arrange
        // Create Objects
        var stdObj = new Student(10, "John", "Alexander", "05/12/1993"); // Student one Object
        var stdTwoObj = new Student(20, "Hameed", "Attayi", "05/25/1973"); // Student Two Object
        // Action --> Print the information of firstStudent
        stdObj.printStudentInformation();
        // Action --> Print the information of secondStudent
        stdTwoObj.printStudentInformation();

    }
}
