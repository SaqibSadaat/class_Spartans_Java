package week_7.day_4;

import java.util.Scanner;

public class ActivityTwo {
    /*    Sports Ranking:

    Objective: Maintain a leaderboard of top 5 sports teams and display the top team.

    Steps:

    Declare a 1D array to hold the names of 5 teams.
    Populate the array with names based on their ranking.
    To find the top-ranked team, access the element at index 0.
    Print the name of the top-ranked team.

*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] teams = new String[5];

        System.out.print("Enter the names of the top 5 sports teams (one per line):");
        for (int i = 0; i < teams.length; i++) {
            teams[i] = scanner.nextLine();
        }

       System.out.println("The top-ranked team is: " + teams[0]);

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
