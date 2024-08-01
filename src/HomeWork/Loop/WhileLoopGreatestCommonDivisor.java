package HomeWork.Loop;

public class WhileLoopGreatestCommonDivisor {
    public static void main(String[] args) {
        // Step 1: Initialize variables a and b with given values
        int a = 48;
        int b = 18;

        // Step 2: Start a while loop that continues until b is not equal to 0
        while (b != 0) {
            // Step 3: Store the current value of b in a temporary variable temp
            int temp = b;
            System.out.println(temp);

            // Step 4: Update b to be the remainder of a divided by b (a % b)
            b = a % b;

            // Step 5: Update "a" to be the previous value of b (stored in temp)
            a = temp;
        }
        // Step 6: Print the computed GCD (which is now stored in a)
        System.out.println("GCD is: " + a);
    }


}
