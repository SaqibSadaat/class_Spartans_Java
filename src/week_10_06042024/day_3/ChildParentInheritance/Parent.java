package week_10_06042024.day_3.ChildParentInheritance;

public class Parent {
    String message;

    public Parent(String message) {
        this.message = message;
        System.out.println("Hey, I am being called from JavaOne Constructor! " + message);
    }
}
