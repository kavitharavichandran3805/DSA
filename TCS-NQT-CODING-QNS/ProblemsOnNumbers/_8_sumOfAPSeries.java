// Sn​=n/2​[2a+(n−1)d]

import java.util.*;

public class _8_sumOfAPSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int d = scan.nextInt();
        double sum = (n / 2.0) * (2 * a + (n - 1) * d);
        System.out.println(sum);
        scan.close();
    }
}
