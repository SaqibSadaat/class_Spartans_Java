package week_2.day_2;

public class DataTypeMaxMinValue {

    public static void main(String[] args) {
        //Non-Decimal Values
        byte byteNumber = 127; // max value of byte
        short shortNumber = 32767; // max value of short
        int intNumber = 2147483647; // max value of int
        long longNumber = 9223372036854775807L; //type L at the end

        //Decimal Values
        float floatNumber = 30.25F;
        double doubleNumber = 25.20;

        // Char values
        char charValue = 'A'; //Any character except sequence of character! 

        //Boolean values
        boolean islightTurnedOn = false; // true / false!

        //Print the minimum and maximum values of Byte data type
        System.out.println("Min value of Byte: " + Byte.MIN_VALUE );
        System.out.println("Min value of Byte: " + Byte.MAX_VALUE);

        //Print the minimum and maximum values of Short data type
        System.out.println("Min value of Short: " + Short.MIN_VALUE );
        System.out.println("Min value of Short: " + Short.MAX_VALUE );

        //Print the minimum and maximum values of int data type
        System.out.println("Min value of int: " + Integer.MIN_VALUE );
        System.out.println("Min value of int: " + Integer.MAX_VALUE );

        //Print the minimum and maximum values of Long data type
        System.out.println("Min value of Long: " + Long.MIN_VALUE );
        System.out.println("Min value of Long: " + Long.MAX_VALUE );

        //Print the minimum and maximum values of float data type
        System.out.println("Min value of Float: " + Float.MIN_VALUE );
        System.out.println("Min value of Float: " + Float.MAX_VALUE );

        //Print the minimum and maximum values of Double data type
        System.out.println("Min value of Double: " + Double.MIN_VALUE );
        System.out.println("Min value of Double: " + Double.MAX_VALUE );



    }
}
