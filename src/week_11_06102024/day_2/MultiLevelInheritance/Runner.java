package week_11_06102024.day_2.MultiLevelInheritance;

import week_11_06102024.day_2.MultiLevelInheritance.Child;

public class Runner {
    public static void main(String[] args) {

        // Create an object of Child
        var childObj = new Child("John", "Eric", "Alex");
        childObj.updateChildName("Eagle");
        childObj.printChildInfo();
        childObj.printChildNameUpdates();
        childObj.updateChildName("Something");
        childObj.printChildNameUpdates();


    }
}
