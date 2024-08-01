package week_3.day_3;

public class ModificationManipulation {
    public static void main(String[] args) {
        // Original data (String)
        String name = "John Doe";

        // Modification (changing the original data)
        name = name.toUpperCase(); // Now name is "JOHN DOE"

        // Manipulation (creating a new representation without changing original data)
        String lastName = name.substring(name.indexOf(" ") + 1); // lastName is "Doe" (extracted from original)

        System.out.println(name); // Prints "JOHN DOE" (modified)
        System.out.println(lastName); // Prints "Doe" (manipulated)
    }
}
