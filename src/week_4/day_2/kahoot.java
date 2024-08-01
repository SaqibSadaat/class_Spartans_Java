package week_4.day_2;

public class kahoot {

    public static void main(String[] args) {
        String test = "Hello, Java! ";
        System.out.println(test.length());

        String s = "Java programming";
        String sub = s.substring(5, 16);
        System.out.println(sub);

        String sentence = "Hello, world!";
        String modified = sentence.replace('o', 'a');
        System.out.println(modified);

        String phrase = "Hello, hello, HeLLo!";
        int index = phrase.indexOf("hello");
        System.out.println(index);


    }
}
