import java.util.Scanner;

public class _4_removingDuplicates {
    // works for sorted array
    public static void remove(int[] a, int n) {
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (a[i] != a[j]) {
                ++j;
                a[j] = a[i];
                ++i;
            } else {
                ++i;
            }
        }
        for (int k = 0; k <= j; k++) {
            System.out.print(a[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        remove(a, n);
        scan.close();
    }
}
