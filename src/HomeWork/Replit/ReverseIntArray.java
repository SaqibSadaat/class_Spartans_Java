package HomeWork.Replit;

public class ReverseIntArray {
    public static void main(String[] args) {
        // I. Declare an integer array arr with some initial values
        int[] arr = {1, 2, 3, 4, 5}; //This is a for loop that iterates 5 times (once for each element in the array).

        // II. Create a for loop to iterate from the end of the array
        for (int i = arr.length - 1; i >= 0; i--) { // -1 is for count the index started from zero not length that start from 1.
            // III. Inside the loop, print the value of arr[i]
            System.out.print(arr[i]);
        }
    }

}
