package HomeWork.Collection.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {


        LinkedHashSet<String> setOfNames = new LinkedHashSet<>();
        setOfNames.add("Tony");
        setOfNames.add("John");
        setOfNames.add("Elham");
        setOfNames.add("Hammad");

        System.out.println(setOfNames); //It will print the name in order.

    }
}