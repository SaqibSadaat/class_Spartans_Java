package Week_13_06242024.leb_session.abstraction;

public abstract class ClassA {

    String firstName;
    String lastName;

    public abstract void print();

    public void printFirstName() {
        System.out.println("FirstName: " + firstName);
    }

}
