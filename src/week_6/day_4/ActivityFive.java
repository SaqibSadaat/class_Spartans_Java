package week_6.day_4;

public class ActivityFive {
     /*    Question: Age Verification for a Theme Park Ride

    A theme park ride has an age restriction. Only those who are 12 years old or older can go on the ride.
    A visitor wants to try the ride and provides their age: int visitorAge = 10; (This value can be changed for testing).
    Check the visitor's age against the age restriction.
    Determine:
    If the visitor is old enough for the ride.
    If the visitor is too young.
    Print out whether the visitor can go on the ride or not.

*/

    public static void main(String[] args) {
        int visitorAge = 10;
        if(visitorAge >= 12) {
            System.out.println("The visitor can go on the ride");
        }else {
            System.out.println("The visitor is too young.");
        }

        System.out.println( " ***** ***** Ternary Operator ***** ***** ");




    }


}
