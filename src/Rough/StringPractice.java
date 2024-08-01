package Rough;

public class StringPractice {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str2 == str3); //the reference is different
        System.out.println(str2.equals(str3)); //value is same 

    }
}
