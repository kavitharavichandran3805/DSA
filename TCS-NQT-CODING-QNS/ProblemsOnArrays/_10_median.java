// Problem Statement: Given an unsorted array, find the median of the given array.

// Examples:

// Example 1:
// Input: [2,4,1,3,5]
// Output: 3

// Example 2:
// Input: [2,5,1,7]
// Output: 3.5

import java.util.*;

public class _10_median {

    public static double getMedianOdd(int[] a) {
        Arrays.sort(a);
        int mid = a[(a.length / 2)];
        return (double) mid;
    }

    public static double getMedianEven(int[] a) {
        Arrays.sort(a);
        int mid = a[a.length / 2] + a[a.length / 2 - 1];
        return (double) mid / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = scan.nextInt();
        }
        if (a.length % 2 == 0) {
            System.out.println(getMedianEven(a));
        } else {
            System.out.println(getMedianOdd(a));
        }
        scan.close();
    }
}
