package Week_13_06242024.day_1.Excercise;

import Week_13_06242024.day_1.Excercise.calculator;

public class calculatorRunner {
    public static void main(String[] args) {

        var calObj = new calculator();
        calObj.sum(40, 40);
        System.out.println(calObj);

        calObj.sum(120,110, 90);
            System.out.println(calObj);

    }
}
