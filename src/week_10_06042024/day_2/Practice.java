package week_10_06042024.day_2;

public class Practice {
    public static void main(String[] args) {
        // Objects
        var empOneObj = new Employee("John", "Alexander", "mm/dd/yyyy");
        var empTwoObj = new Employee("Eric", "Morphy", "mm/dd/yyyy");
        var empThreeObj = new Employee("Eric", "Kubaci", "mm/dd/yyyy");
        // Assert
        empOneObj.printEmployeeInfo();
        empTwoObj.printEmployeeInfo();
        empThreeObj.printEmployeeInfo();
    }
}
