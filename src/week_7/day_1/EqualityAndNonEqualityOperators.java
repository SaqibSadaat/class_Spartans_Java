package week_7.day_1;

public class EqualityAndNonEqualityOperators {
    public static void main(String[] args) {
        if(!("Bob".equals("BoB") && 10 == 0 || "java".equals("isEasy") && false ^ true)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
