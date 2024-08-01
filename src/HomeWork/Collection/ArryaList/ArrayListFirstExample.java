package HomeWork.Collection.ArryaList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFirstExample {

    //if you want to retrieve or access the value, use ArrayList 

    public static void main(String[] args) {
        List<String> listOfName = new ArrayList<String>();
        listOfName.add("Hammad");
        listOfName.add("Sadat");
        listOfName.add("Ali");
        listOfName.add("Khan");
        System.out.println(listOfName);

        System.out.println(listOfName.get(0));
        System.out.println(listOfName.size());


    }

}
