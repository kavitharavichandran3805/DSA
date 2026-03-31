import java.util.Scanner;

public class _16_nthFibo {
    public static int approach1(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int approach2(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return approach2(n - 1) + approach2(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(approach1(n));
        System.out.println(approach2(n));
        scan.close();
    }
}
