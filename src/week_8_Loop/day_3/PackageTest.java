package week_8_Loop.day_3;

public class PackageTest {

    public static void main(String[] args) {

        System.out.println(PackageScope.firstName);
        PackageScope.firstName = "Bob";
        System.out.println(PackageScope.firstName);

    }

}
