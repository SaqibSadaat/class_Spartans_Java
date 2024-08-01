package week_5.day_3;

import java.util.Scanner;

public class IfStatementExampleFour {

    public static void main(String[] args) {

        int marksNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your marks: ");
        marksNumber = scan.nextInt();


        if (marksNumber <= 100 && marksNumber>= 90 ) {
            System.out.println("A grade");
        } else if (marksNumber <= 89 && marksNumber >= 81) {
            System.out.println("B grade");
        } else if (marksNumber <= 80 && marksNumber >= 71) {
            System.out.println("C grade");
        } else if (marksNumber <= 70 && marksNumber >= 0){
            System.out.println("Fale");
        }else {
            System.out.println("Enter the correct entry");
        }
        System.out.println("Your marks: " + marksNumber );

    }
}
