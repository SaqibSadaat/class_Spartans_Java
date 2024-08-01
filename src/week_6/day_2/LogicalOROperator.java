package week_6.day_2;

public class LogicalOROperator {
    public static void main(String[] args) {

        if (true && true && 10 < 11 || false && true || false && true && false) {
            System.out.println("A");

        } else {
            System.out.println("B");
        }

    }
}
