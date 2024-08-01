package HomeWork.MultiLevelInheritanceSecond;

public class B extends A {

    String color;
    String model;
    int year;

    public B(String companyName, String color, String model, int year) {
        super(companyName);
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public void stopped() {System.out.println("This car is stopped");}
}
