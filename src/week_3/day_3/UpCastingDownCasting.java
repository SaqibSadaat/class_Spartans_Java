package week_3.day_3;

public class UpCastingDownCasting {

    public static void main(String[] args) {

        //Upcasting
        System.out.println(" 1  ***** ***** Upcasting ***** ***** ");
        System.out.println(100.0/(20*2)); //2.5
        System.out.println((double) 100/(20*2)); //can do this way
        System.out.println(100/40.0);

        System.out.println(" 2  ***** ***** ***** ***** ***** ***** ");
        System.out.println( (int) 100 / 40.0); //2.5 //it will Downcast the 100 not 40.0
        System.out.println( 100 / (int) 40.0); //2 //it will Downcast the 100 not 40.0

        System.out.println("***** ***** ***** ***** ***** ***** ");

        //Down-casting
        System.out.println(" 1  ***** ***** Down-casting ***** ***** ");
        System.out.print("Down-casting: ");
        System.out.println(100/(20*2.5)); //2
        System.out.println((int) 100.0/(20*2.5)); //2

        //        int doubleValeNumber = 50.25; //it will not be accepted
        int doubleValeNumber = (int) 50.25; //you can downcast with int() but will loose the decimal value.
        System.out.println(doubleValeNumber);

        System.out.println("***** ***** % ***** ***** ");
        int x = 6;
        int j = 4;
        System.out.println(x % j); //2





    }
}
