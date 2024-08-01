package week_5.day_3;

import java.util.Scanner;

public class IfStatementWithScanner {
    public static void main(String[] args) {
        char grade;
        int marks;
        Scanner scnObj = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        marks = scnObj.nextInt();

        if(marks <= 100 && marks >= 90) {
            grade = 'A';
        }else if (marks <= 89 && marks >= 81) {
            grade = 'B';
        }else if (marks <= 80 && marks >= 71) {
            grade = 'C';
//        }else if( marks > 100) {
//            System.out.println("Pleas enter a number between 0 to 100");
        }else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade + " Marks: " + marks);

    }
}
