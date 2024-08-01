package week_5.day_2;

public class IncrementDecrement {
    public static void main(String[] args) {
        int numberOne = 120;
        numberOne++; //modified to 121
        System.out.println(numberOne); //121 just printed actual value

        numberOne++; //modified to 122
        System.out.println(numberOne++); //print 122 the actual value and also modify to 123
        System.out.println(numberOne); //Just print the actual value of 123

        --numberOne; //Decremented to 122
        System.out.println(numberOne); // just print 122
        System.out.println(numberOne--); //print actual value 122 and modify to 121 also
        System.out.println(numberOne); //just print 121

    }
}
