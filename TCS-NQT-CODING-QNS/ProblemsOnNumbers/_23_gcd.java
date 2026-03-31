import java.util.Scanner;

public class _23_gcd {

    public static int gcd_recursion(int a, int b) {
        if (b == 0)
            return a;
        return gcd_recursion(b, a % b);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findGCD(int[] a) {
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            result = gcd_recursion(result, a[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("GCD = " + findGCD(arr));
        sc.close();
    }
}
