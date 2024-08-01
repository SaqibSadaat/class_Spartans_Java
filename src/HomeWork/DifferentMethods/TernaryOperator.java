package HomeWork.DifferentMethods;

public class TernaryOperator {
    public static void main(String[] args) {

        //it called a ternary operator or conditional operator
        int a = 10, b = 20;
        int result = (a > b) ? a : b;
        System.out.println(result);

        //Here's an equivalent if-else statement that achieves the same functionality:
        if (a > b) {
            result = a;
        } else {
            result = b;
            System.out.println(result);
        }

    }

}