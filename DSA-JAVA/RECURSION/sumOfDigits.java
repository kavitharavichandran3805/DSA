import java.util.Scanner;

public class sumOfDigits {
    static int s = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        int sum = func(n);
        System.out.println(sum);
        scan.close();
    }

    public static int func(int n) {
        // int r;
        // if (n > 0) {
        // r = n % 10;
        // s += r;
        // func(n / 10);
        // }
        // return s;
        // if (n == 0) {
        // return 0;
        // }
        if (n % 10 == n) {
            return n;
        }
        return (n % 10 + func(n / 10));
    }
}
