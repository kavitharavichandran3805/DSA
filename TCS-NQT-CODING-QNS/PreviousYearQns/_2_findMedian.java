import java.util.Scanner;

public class _2_findMedian {

    public static double getMedian(int[] a, int n) {
        if (n % 2 != 0) {
            return (double) a[n / 2];
        }
        return (double) (a[n / 2] + a[n / 2 - 1]) / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(getMedian(a, n));
        scan.close();
    }
}
