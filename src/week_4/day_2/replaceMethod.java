package week_4.day_2;

public class replaceMethod {
    public static void main(String[] args) {

        String message = "Hello World";
        System.out.println(message);

        //Syntax of calling String method
        //nameOfVariable.method();

        message = message.replace("Hello", "Jello");
        System.out.println(message);

        message = message.replace('J', 'H');
        System.out.println(message);

        //Remove spaces between words in a String.
        String welcome = "Welcome to the Java World";
        System.out.println(welcome);
        System.out.println(welcome.replaceAll(" ", ""));//there is no space print in the Console.



    }
}
