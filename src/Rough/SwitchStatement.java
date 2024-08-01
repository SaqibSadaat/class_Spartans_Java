package Rough;

public class SwitchStatement {
    public static void main(String[] args) {
        String name = "Saqib";
        switch (name) {
            case "John":
            case "Doe":
            case "Alex":
            case "Eric":
            case "Erin":
            case "Mathias":
                System.out.println(name + " is the student of this class");
                break;
            default:
                System.out.println(name + " is not the student of this class");
                break;
        }
    }
}
