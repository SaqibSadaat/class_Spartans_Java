package week_9.day_2.ParameterizedMethods;
//05/29/2024
public class CalculatorRunner {
    public static void main(String[] args) {
        // Object of Calculator Class
        var calObj = new Calculator();
        calObj.printMessage();
        calObj.printSumOfTwoNumbers(150, 260);
        calObj.printSumOfTwoNumbers(80, 40);
    }

}
