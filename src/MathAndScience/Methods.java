package MathAndScience;

public class Methods {
    /*
     * What is "VOID" means? basically methods this method is extremely simple we
     * transfer control we print some stuff and then we jump back up, so the method
     * itself doesn't actually do anything other than print something to the screen
     * and so we declare it as void and that means that it donesn't return anything
     * to what from where from whence it came. basically in other words methods can
     * be used for a lot more than just printing stuff on the screen. for instance
     * int a; a=a+4 I can declare a variable here integer a or something like that
     * and I can say "a" is equal to a plus four or whatever inside of this method I
     * can do calculations I can do loops I can do anything I want inside of that
     * let's say I am doing a calculation I want to add two numbers together then
     * whenever I call the method and the calculation gets done down here I am going
     * to want to pass the result back from where I came from in other words maybe I
     * have instead of drawing a rectangle on the screen maybe the purpose of this
     * method is to average glit grades in a classroom may be to add everything up
     * and divide that maybe that's what the purpose of this is and we'll get to
     * this in future sections if the method is going to return a number as an
     * answer back from where you came from as a calculation or something then you
     * would return you would tell Java that you plan to return an integer back or
     * you plan to return a double back but here we don't plan to return anything
     * back because we're just printing stuff so we have to declare it as void back
     * but here we don't plan to return anything back because we're just printing
     * stuff so we have to declare it as void that tells Java don't expect a number
     * to come back to you it's just gonna do something inside of here maybe
     * printing something along those lines so "VOID" means the method doesn't
     * return anything it doesn't return an answer or a calculation or number that's
     * what it means, void means: don't expect an answer out of me I'm not
     * calculating anything essentially is what it means.
     */

    public static void main(String[] args) {
        System.err.println("Program start.\n");
        printFirstName(); //custom methods --> methods made by programmers or by you
        printLastName();
        addNames();
        System.out.println("\nProgram end.");

    }
    public static void printFirstName() {
        System.out.println("My first name is Saqib");
        int v, v1, v2, v3;
        v = 3;
        v1 = 4;
        v2 = 5;
        v3 = 6;
        int sum = v + v1 + v2 + v3;
        System.out.println("Total value: " + sum);
    }

    public static void printLastName() {
        System.out.println("\nMy last name is Sadaat");

    }

    public static void addNames() {
        int saqib = 5;
        int sadaat = 6;
        int sum;
        sum = saqib + sadaat;
        System.out.println("The number of letters in my full name is: " + sum);
    }

}
