package week_4.day_4;

public class Question05 {
        /*
     * Question 05: Problem Statement:
     * Given the string "programming", write a Java program to extract and print the substring
     * starting from index 3 up to the end of the string.
     *
     *  Expected Output: gramming
     *
     * */

    public static void main(String[] args) {
        String str1 = "programming";
        str1 = str1.substring(3);
        System.out.println(str1);

        //Second Solution
        System.out.println(str1.substring(3));
    }

}
