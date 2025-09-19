import java.util.Scanner;

public class fibonacci_rec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i));
        }
        scan.close();
    }

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}