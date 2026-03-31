import java.util.Scanner;

public class _24_lcm {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int[] a) {
        int lcm = a[0];
        for (int i = 1; i < a.length; i++) {
            lcm = (lcm * a[i]) / gcd(lcm, a[i]);
        }
        return lcm;
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

        System.out.println("LCM = " + findLCM(arr));
        sc.close();
    }
}
