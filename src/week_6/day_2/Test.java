package week_6.day_2;

public class Test {

    public static void main(String[] args) {
        if (10 < 20 && 10 > 5) { //the following if-statement will be executed if this if-statement would be true.
                                //otherwise it will not be executed.
            System.out.println("A");
            if (true && false && true && true) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
            if (5 > 0) {
                System.out.println("Z");
            }
            System.out.println("Spartans");
        } else {
            System.out.println("java is easy!");
        }
    }
}
