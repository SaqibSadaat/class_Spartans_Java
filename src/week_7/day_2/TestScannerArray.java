package week_7.day_2;

import java.util.Scanner;

public class TestScannerArray {
    /*
Bookshelf Organizer:

Objective: Store a collection of book titles and retrieve a book by its position on the shelf.

Steps:

Declare a 1D array to hold a certain number of book titles.
Assign a book title to each position in the array.
To find the title of the book that's 3rd from the left, access the element at index 2.
Print the book title retrieved from the array.

Note: Use Scanner!

*/
    public static void main(String[] args) {

        String[] bookTitles = new String[2];
        var scnObj = new Scanner(System.in);

        System.out.print("Enter first book title: ");
        bookTitles[0] = scnObj.nextLine();

        System.out.print("Enter second book title: ");
        bookTitles[1] = scnObj.nextLine();

        System.out.println(bookTitles[1]);


    }

}
