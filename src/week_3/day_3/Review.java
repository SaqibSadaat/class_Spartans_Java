package week_3.day_3;

public class Review {
    public static void main(String[] args) {
//        System.out.println(10 * "10" + 100 - 50); //cannot put minus sign in concatenating
//        System.out.println(20 - 2 * "10");
        int x = 10;
        double j = 3;
        System.out.println(x/j);

        int a = 10;
        int b = a + 1;
        System.out.println(a + b * a);
        //                 10 + 11 * 10

        int num = 10, num2 = 20, num3 = 30;
        System.out.println(num + num2 + num3);

        int number, number2, number3;
        number = 10; number2 = 20; number3 = 30;
        System.out.println(number + number2 + number3);

        System.out.println(5 > 2);

        String str = null;
        //System.out.println("Text length: " + str.length()); // will give Runtime exception

        System.out.println( "*************************************************");

        int n = 5;
        String result = "Sum: " + n + 5;
        System.out.println(result + "is ten");

        System.out.println( "*************************************************");

        boolean check = true;
        //System.out.println("Access is " + check == "Access is true"); // The comparison == is used incorrectly

        System.out.println( "*************************************************");

        System.out.println("Result: " + 2 + 2);
        System.out.println("Result: " + 2 + 2 == "Result: 4"); // Result: 22 == Result 4 (false)













    }
}
