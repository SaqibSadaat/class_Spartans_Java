package week_12_06172024.lab_session.WorkingWithScanner;

import java.util.Scanner;

public class GeminiUserInput {

    public static int getArraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the username array: ");
        int size = scanner.nextInt();
        return size;
    }

    public static String[] getUsernames(int size) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter username " + (i + 1) + ": ");
            usernames[i] = scanner.nextLine();
        }

        return usernames;
    }
}
