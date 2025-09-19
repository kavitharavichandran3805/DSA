import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        int dig = (int) (Math.log10(n)) + 1;
        boolean ans = func(n, dig);
        System.out.println("Palindrome = " + ans);
        scan.close();
    }

    public static boolean func(int n, int dig) {
        return rev(n, dig) == n;
    }

    public static int rev(int n, int dig) {
        if (n % 10 == n) {
            return n;
        }
        return ((n % 10) * (int) (Math.pow(10, dig - 1))) + rev(n / 10, dig - 1);
    }
}
