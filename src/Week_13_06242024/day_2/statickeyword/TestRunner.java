package Week_13_06242024.day_2.statickeyword;

public class TestRunner {
    public static void main(String[] args) {

        TestClass.firstName = "John";
        TestClass.lastName = "Alexander";

        TestClass.printInfo();

        TestClass.firstName = "Eric";

        TestClass.printInfo();

    }
}

