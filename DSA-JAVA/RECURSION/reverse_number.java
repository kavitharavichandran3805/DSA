import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        int dig = (int) (Math.log10(n)) + 1;
        int num = func(n, dig);
        System.out.println(num);
        scan.close();
    }

    public static int func(int n, int dig) {
        if (n % 10 == n) {
            return n;
        }
        return ((n % 10) * (int) (Math.pow(10, dig - 1))) + func(n / 10, dig - 1);
    }
}
