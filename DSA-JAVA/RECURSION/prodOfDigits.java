import java.util.Scanner;

public class prodOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        int prod = func(n);
        System.out.println(prod);
        scan.close();
    }

    public static int func(int n) {
        if (n <= 1) {
            return 1;
        }
        return (n % 10 * func(n / 10));
    }
}
