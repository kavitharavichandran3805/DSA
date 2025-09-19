import java.util.Scanner;

public class count_steps {
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
        if (n % 2 == 0) {
            return func(n / 2, ct + 1);
        }
        return func(n - 1, ct + 1);
    }
}
