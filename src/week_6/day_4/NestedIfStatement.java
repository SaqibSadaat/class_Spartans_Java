package week_6.day_4;

public class NestedIfStatement {

    public static void main(String[] args) {
        if (!(true && true || false || false || true && true && true ^ true ^ false)) {
            System.out.println("A");
            if (false || false ^ true ^ true && true && true || false || 10 < 5 || 100 < 200) {
                System.out.println("B");
                if (5 < 10 && true ^ false && false && true && false || false) {
                    System.out.println("C");
                    if (true) {
                        System.out.println("D");
                    } else {
                        System.out.println("U");
                    }
                } else {
                    System.out.println("K");
                }

            }
        }
    }
}



