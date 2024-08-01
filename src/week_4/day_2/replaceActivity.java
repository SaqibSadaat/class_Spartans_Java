package week_4.day_2;

public class replaceActivity {
    public static void main(String[] args) {
        //Given a String first Name = "Alexander Morphy"
        // 1: Replace "Alexander" with "Erin".
        // 2: Replace "Morphy" with Curreto";
        // 3: Replace "Erin Curreto" with "John Doe"
        // 4: Remove the space between "John" and "Doe" --> Expected Result should be:
        // JohnDoe
        // 5: Print the length of firstName.

        String firstName = "Alexander Morphy";

        // 1: Replace "Alexander" with "Erin".
        firstName = firstName.replace("Alexander", "Erin");
        System.out.println(firstName);

        // 2: Replace "Morphy" with Curreto";
        firstName = firstName.replace("Morphy", "Curreto");
        System.out.println(firstName);

        // 3: Replace "Erin Curreto" with "John Doe"
        firstName = firstName.replaceAll("Erin Curreto", "John Doe");
        System.out.println(firstName);


        
        // 4: Remove the space between "John" and "Doe" --> Expected Result should be: JohnDoe
        firstName = firstName.replaceAll(" " , "");
        System.out.println(firstName);

        // 5: Print the length of firstName.
        System.out.println(firstName.length());




    }
}
