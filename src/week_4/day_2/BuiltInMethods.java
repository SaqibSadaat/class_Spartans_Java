package week_4.day_2;

public class BuiltInMethods {
    public static void main(String[] args) {

        String fullName = "Eric Morphy";
        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(1));
        System.out.println(fullName.charAt(3));
        int lastIndex = fullName.length() -1; //10
        System.out.println(fullName.length() -1); //10

        System.out.println( "* * * * * * * * * * * * * * 2 * * * * * * * * * * * * * * * * * * * ");

        System.out.println(fullName.charAt(fullName.length() -1));

        System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        //SubString
        System.out.println(fullName.substring(7));

        //if you pass3, it is going to be 2 since 3 - 1 = 2;
        System.out.println(fullName.substring(0,4));

        System.out.println(fullName.substring(1, (fullName.length() -1 ) +1 ));
        System.out.println(fullName.substring(1,4));

        System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

        String message = "The Main method is the entry point of an executable program; " +
                "it is where the program control starts and ends. Main is declared inside " +
                "a class or struct. Main must be static and it need not be public . " +
                "(In the earlier example, it receives the default access of private.)";
        System.out.println(message);
        System.out.println(message.length());

        System.out.println(message.substring(0, 10));  //print the first 10 charcters
        System.out.println(message.substring(10)); //ignore the first 10 characters

        System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(message.substring( 10, message.length() - 10 ));
                                        // ignore 10 char and find the lenght and minus the last 10 characters.








    }
}
