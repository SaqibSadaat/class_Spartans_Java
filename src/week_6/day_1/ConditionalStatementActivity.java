package week_6.day_1;

import java.util.Scanner;

public class ConditionalStatementActivity {
    /*
    Question: Favorite Color Picker

    You have two color options: String color1 = "Red"; and String color2 = "Blue";.
    You like the color "Red" more than "Blue".
    Using the conditional operator, determine which color is your favorite.
    Store your favorite color in a variable called favoriteColor.
    Print out your favorite color. What is the color?
*/
    public static void main(String[] args) {
        String color1 = "Red";
        String color2 = "Blue";
        String favoriteColor;

       favoriteColor = (color1.equals(color2)) ? color1 : color2;
        System.out.println( "My favorite Color is: " + favoriteColor);






    }
}
