package HomeWork.Collection.HashSet;

import java.util.HashSet;

public class firstExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Adding duplicate element (won't be added)
        set.add("apple");

        // Removing an element
        set.remove("banana");

        // Checking if an element is present
        if (set.contains("orange")) {
            System.out.println("Set contains orange");
        }

        // Iterating over elements
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
