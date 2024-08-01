package week_4.day_4;

public class Question4 {

    /*
     *  Question 04: Problem Statement:
     *  Write a Java program that extracts the word "Java" from the string "Hello Java World".
     *  Print the extracted substring to the console.
     *
     * Expected Output: Java
     *
     *
     * */

    public static void main(String[] args) {
        String str1 = "Hello Java World";
        System.out.println("Start from: " + str1.indexOf("Java")); //find the Java Starting number

        //First solution
//        System.out.println("End at: " + (str1.indexOf("World") -1);

        //Second solution
        String str2 = str1.substring(6, 10);
        System.out.println(str2);

    }


}
