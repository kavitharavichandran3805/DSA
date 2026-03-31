import java.util.Scanner;

public class _18_powerOfNumber {

    public static double approach1(double num, int exp) {
        return Math.pow(num, exp);
    }

    public static double approach2(double num, int exp) {
        double ans = 1.0;
        double n = (exp > 0) ? exp : (-1 * exp);
        while (n > 0) {
            if (n % 2 == 0) {
                num *= num;
                n /= 2;
            } else {
                ans *= num;
                n = n - 1;
            }
        }
        if (exp < 0)
            return (1.0) / (ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        int exp = scan.nextInt();
        System.out.println(approach1(num, exp));
        System.out.println(approach2(num, exp));
        scan.close();
    }
}
