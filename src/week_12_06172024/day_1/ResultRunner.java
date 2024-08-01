package week_12_06172024.day_1;

public class ResultRunner {
    public static void main(String[] args) {

        int[] numbers = { 95, 2, 3, 4, 5, 6, 7, 8, 9, 155 };
        String[] names = {"Tony", "James", "Alexander"};

        sumOfFirstAndLastNumbersOfArray( numbers );

        printIntArray( numbers );
        System.out.println();
        printStringArray( names );
    }
    // The sum of 1 + 10 = 11
    // The sum of 90 + 100 = 190

//    public static void sumOfFirstAndLastNumbersOfArray( int[] array ) {
//    int firstValue = array[0];
//    int lastValue = array[array.length -1];
//    int result = firstValue + lastValue;
//        System.out.println("The sum of " + firstValue + " + " + lastValue + " = " + result);

//    The following code is correcter than the above code (more readable).
    public static void sumOfFirstAndLastNumbersOfArray( int[] array ) {
        System.out.println("The sum of " + array[0] + " + " + array[array.length - 1] + " = " +
                ( array[0] + array[array.length - 1] ) );
    }

    public static void printStringArray( String[] array ) {
        for ( String value : array ) System.out.print( value + " " ); //The + " " converted the int value to String.
    }

    public static void printIntArray( int[] array ) {
        for ( int value : array ) System.out.print( value + " " );
    }
}
