import java.util.Scanner;

public class counting_zeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        int count = func(n, 0);
        System.out.println(count);
        scan.close();
    }

    public static int func(int n, int ct) {
        if (n == 0) {
            return ct;
        }
        if (n % 10 == 0) {
            return func(n / 10, ct + 1);
        }
        return func(n / 10, ct);
    }
}
