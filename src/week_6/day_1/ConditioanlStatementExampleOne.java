package week_6.day_1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ConditioanlStatementExampleOne {

    public static void main(String[] args) {
        int marks = 80;
        char grade;

        grade = ( marks >= 90 && marks <= 100 ) ? 'A' : 'B';
        System.out.println( "Grade: " + grade);

    }
}
