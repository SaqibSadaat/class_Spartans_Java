package week_7.day_4;

public class TampretureConverter {
    /*
     Write a java program which is going to convert C to F.
      Prompt the user to enter a C temp and then convert it ot F
      At the end, display the converted result into the console.
     * */
    public static void main(String[] args) {
        double celsius = 20.0;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");

    }

}
