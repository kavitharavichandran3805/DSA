import java.util.Scanner;

public class _17_factorial {

    public static int approach1(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * approach1((n - 1));
    }

    public static int approach2(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(approach1(n));
        System.out.println(approach2(n));
        scan.close();
    }
}
