package Week_14_07012024.day_3;

import java.util.HashMap;

public class HashMapExampleOne {
    public static void main(String[] args) {

        var myMap = new HashMap<Integer, String>();
        myMap.put(1, "Tony");
        myMap.put(2, "Bob");
        myMap.put(3, "Alexander");
        myMap.put(4, "Eric");

        System.out.println(myMap);

        //Add an entry
        myMap.put(5, "John");
        System.out.println(myMap);



    }
}
