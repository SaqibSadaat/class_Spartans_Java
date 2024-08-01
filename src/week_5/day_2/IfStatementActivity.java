package week_5.day_2;

public class IfStatementActivity {
    /*
      Question 1: Weather Decisions

      1. Declare three boolean variables: isRaining, hasUmbrella, and isWindy.
      Assign any values of your choice to these variables.
      Write a condition to determine if you should go out or stay indoors. What is the result based on your values?
      Using the same variables, determine if you should take an umbrella when going out. Which conditions
      influenced your decision?
      Finally, decide if you should wear a windbreaker based on the given conditions.
  */
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean hasUmbrella = true;
        boolean isWindy = false;

        if (isRaining) {
            System.out.println("Don't go out!");
        } else {
            System.out.println("You can go outside!");
        }
        if (hasUmbrella) {
            System.out.println("You can go!");
        } else {
            System.out.println("Don't go out!");
        }
        if (isWindy) {
            System.out.println("Be careful outside when it is Windy");
        } else {
            System.out.println("You don't need to be worry when it is not Windy");
        }
    }

}
