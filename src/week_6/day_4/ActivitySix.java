package week_6.day_4;

public class ActivitySix {
    /*
    Question: Apple Comparison
    You have two apples with weights: double apple1Weight = 150.0; and double apple2Weight = 155.5;.
    Compare the weights of the two apples.

    Determine:

    If the weights are the same.
    If the weights are different.
    Print out the results of your comparisons.
*/
    public static void main(String[] args) {

        double apple1Weight = 150.0, apple2Weight = 155.5;

        if (apple1Weight == apple2Weight) {
            System.out.println("the weights are the same");
        } else {
            System.out.println("the weights are different.");
        }
        System.out.println(apple1Weight == apple2Weight);
    }
}
