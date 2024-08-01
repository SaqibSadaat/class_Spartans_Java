package week_8_Loop.day_1;

public class WhileLoopActivityTwo {
    public static void main(String[] args) {

        String[] studentNames = {"Bob", "Tony", "Eric", "John", "Mahdi", "Mathias", "fazli"};
/*
        // Initialization
        int index = 0;

        // Condition
        while ( index < studentNames.length ) {
            System.out.println( studentNames[index] );
        // Iteration
            index++;
        }
 */
        // Initialization
        int index = 0;

        // Condition
        while (index < studentNames.length) {
            if (studentNames[index].equals("Mathias"))
                System.out.println(studentNames[index]);
            // Iteration
            index++;
        }

    }


}
