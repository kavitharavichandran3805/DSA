// Month starts on Monday (mon)

// Total days = 13

// We need to find how many Sundays come within these 13 days.

import java.util.Scanner;

public class _7_nextSundays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        String[] days = { "mon", "tues", "wed", "thurs", "fri", "sat", "sun" };
        int n = scan.nextInt();
        int startIndex = -1;
        for (int i = 0; i < days.length; i++) {
            if (day.equalsIgnoreCase(days[i])) {
                startIndex = i;
                break;
            }
        }
        int sundays = 0;
        if (startIndex == 6) {
            sundays = 1 + (n - 1) / 7;
        } else {
            int remainingDays = 6 - startIndex;
            if (n <= remainingDays) {
                sundays = 0;
            } else {
                sundays = 1 + (n - remainingDays) / 7;
            }
        }

        System.out.println(sundays);
        scan.close();
    }
}
