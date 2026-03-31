import java.util.*;

public class _30_addTwoFractions {

    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int d1 = scan.nextInt();
        int n2 = scan.nextInt();
        int d2 = scan.nextInt();
        if (d1 == d2) {
            int n = n1 + n2;
            if (n % d1 == 0) {
                System.out.println(n / d1);
            } else {
                int gcd = findGCD(d2, n);
                int numerator = n / gcd;
                int denominator = d1 / gcd;
                System.out.println(numerator + "/" + denominator);
            }
        } else {
            int lcm = (d1 * d2) / findGCD(d1, d2);
            int x1 = lcm / d1;
            int x2 = lcm / d2;
            int num1 = n1 * x1;
            int num2 = n2 * x2;
            int newNum = num1 + num2;
            if (newNum % lcm == 0) {
                System.out.println(newNum / lcm);
            } else {
                int gcd = findGCD(lcm, newNum);
                int numerator = newNum / gcd;
                int denominator = lcm / gcd;
                System.out.println(numerator + "/" + denominator);
            }

        }
        scan.close();
    }
}
