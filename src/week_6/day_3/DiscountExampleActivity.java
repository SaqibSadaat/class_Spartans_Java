package week_6.day_3;

public class DiscountExampleActivity {

    /*
    4. Ternary Operator:
    In an online store, if a user is a member, they get a 10% discount.
    Given the original price of an item and a boolean isMember, calculate and display the final price
    using the ternary operator.
     */

    public static void main(String[] args) {
        double originalPrice = 100.0; //actual price
        boolean isMember = true; // Replace with true if the user is a member
        double discountRate = 0.1; // 10% discount

        double finalPrice = isMember ? originalPrice * (1 - discountRate) : originalPrice;

        System.out.println("Final price for member: $" + finalPrice);

        isMember = false; // Set to false to test non-member price
        finalPrice = isMember ? originalPrice * (1 - discountRate) : originalPrice;

        System.out.println("Final price for non-member: $" + finalPrice);
    }
}
