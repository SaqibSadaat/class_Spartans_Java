package week_6.day_4;

public class ActivityTwo {

    /*
*  Weekend Alarm

Imagine you have two boolean variables: isWeekend and isHoliday.
On weekends or holidays, you prefer to sleep in, so you set your alarm to OFF.
Otherwise, on weekdays that aren't holidays, you set your alarm to ON.
Set any initial values for isWeekend and isHoliday.
Determine the state of the alarm based on the values
*
* */

    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isHoliday = false;
        boolean alarm = false;


        if (isWeekend || isHoliday) {
            alarm = false;
        } else {
            alarm = true;
            System.out.println("Alarm is set to: " + alarm);
        }

        if (!(isWeekend || isHoliday)) {
            alarm = true;
        } else {
            alarm = false;
            System.out.println("Alarm is set to: " + alarm);
        }

    }
}