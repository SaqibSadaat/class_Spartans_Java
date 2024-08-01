package week_7.day_2;

public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\n" + "\n" + "***** ***** ***** *****" + "\n");

        //if you want to remove the last coma "," from 5.
        for(int x = 1; x <= 5; x++) {
            if(x == 5) {
                System.out.print(x);
            }else{
                System.out.print(x + ", " );
            }


        }
    }
}
