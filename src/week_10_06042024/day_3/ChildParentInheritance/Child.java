package week_10_06042024.day_3.ChildParentInheritance;

public class Child extends Parent {

    public Child(String message) {
        super(message);
        System.out.println("Hey, I am being called from JavaTwo Constructor!");
    }

    // Super: We use Super keyword to access or call the properties of parent class

}
