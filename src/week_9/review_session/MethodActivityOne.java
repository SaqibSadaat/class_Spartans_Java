package week_9.review_session;

public class MethodActivityOne {

    // Create a method which is going to Covert C to F
    // Call & Test your Method.
    // F = (°C × 9/5) + 32
    // C = (°F − 32) x 5/9

    public static void main(String[] args) {
        double celsiusValue = 20.0;
        double fahrenheitValue = 68.0;

        System.out.println(celsiusValue + "°C is equivalent to " + celsiusToFahrenheit(celsiusValue) + "°F");
        System.out.println(fahrenheitValue + "°F is equivalent to " + fahrenheitToCelsius(fahrenheitValue) + "°C");
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


}
