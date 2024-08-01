package Week_14_07012024.day_1.Collection;

import java.util.ArrayList;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<String> listOfName = new ArrayList<String>();
        listOfName.add("John");
        listOfName.add("Mathias");
        listOfName.add("Ali");
        listOfName.add("Khan");
        System.out.println(listOfName);

        System.out.println(listOfName.get(0));
        System.out.println(listOfName.size());

        for(String name : listOfName){
            System.out.print(name + " - ");
        }

    }
}
