import java.util.*;
// A year is a leap year if:

// It is divisible by 4, but not by 100,
// OR

// It is divisible by 400.
public class _12_leapYear {

    public static boolean isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (isLeap(year)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
