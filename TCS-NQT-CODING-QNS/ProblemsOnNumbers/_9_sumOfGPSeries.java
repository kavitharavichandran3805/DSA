
// S = (a(1-r^n))/(1-r) where ris not equal to 1
import java.util.*;

public class _9_sumOfGPSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double a = scan.nextDouble();
        double r = scan.nextDouble();
        double sum;
        if (r == 0) {
            sum = a;
        } else if (r == 1) {
            sum = a * n;
        } else {
            sum = (a * (1 - Math.pow(r, n))) / (1 - r);
        }
        System.out.printf("The sum is : %.2f", sum);
        scan.close();
    }
}
