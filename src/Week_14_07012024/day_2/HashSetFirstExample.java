package Week_14_07012024.day_2;

import java.util.HashSet;

public class HashSetFirstExample {
    public static void main(String[] args) {
        HashSet<String> setOfName = new HashSet<>();
        setOfName.add("Saqib");
        setOfName.add("Ali");
        setOfName.add("Saad");
        setOfName.add("Elham");

        System.out.println(setOfName);

        setOfName.add("Saqib"); //can not add duplicate number.
        System.out.println(setOfName);

    }
}
