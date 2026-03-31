import java.util.*;

public class _14_maxMinOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, rem;
        while (num > 0) {
            rem = num % 10;
            min = Math.min(min, rem);
            max = Math.max(max, rem);
            num /= 10;
        }
        System.out.println("Max digit : " + max);
        System.out.println("Min digit : " + min);
        scan.close();
    }
}
