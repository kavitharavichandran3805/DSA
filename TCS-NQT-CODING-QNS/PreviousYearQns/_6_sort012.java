import java.util.*;

// Dutch National Flag problem
// Given an array that only contains 0s, 1s, and 2s,
// sort it in-place (i.e., without using extra space) and in O(n) time.
public class _6_sort012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, mid, low);
                ++low;
                ++mid;
            } else if (a[mid] == 1) {
                ++mid;
            } else {
                swap(a, mid, high);
                --high;
            }
        }
        System.out.println(Arrays.toString(a));
        scan.close();
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
