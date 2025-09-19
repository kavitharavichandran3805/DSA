import java.util.Arrays;
import java.util.Scanner;

public class binary_search_rec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, s, pos;
        System.out.println("Enter the size of the array");
        n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter the element to be searched");
        s = scan.nextInt();
        pos = bn_rec(a, 0, n - 1, s);
        if (pos != -1) {
            System.out.println("The element is found in position " + (pos + 1));
        } else {
            System.out.println("Element not found");
        }
        scan.close();
    }

    public static int bn_rec(int[] a, int st, int e, int s) {
        if (st > e) {
            return -1;
        }
        int mid = st + (e - st) / 2;
        if (a[mid] == s) {
            return mid;
        } else if (a[mid] > s) {
            return bn_rec(a, st, mid - 1, s);
        }
        return bn_rec(a, mid + 1, e, s);
    }
}
