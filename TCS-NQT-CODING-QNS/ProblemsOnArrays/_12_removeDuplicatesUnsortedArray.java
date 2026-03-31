
// Problem Statement: Given an unsorted array, remove duplicates from the array.

// Examples:

// Example 1:
// Input: arr[]={2,3,1,9,3,1,3,9}
// Output:  {2,3,1,9}

// Explanation: Removed all the duplicate elements

// Example 2:
// Input: arr[]={4,3,9,2,4,1,10,89,34}
// Output: {3,4,9,2,1,10,34,89}
// Explanation: Removed all the duplicate elements
import java.util.*;

public class _12_removeDuplicatesUnsortedArray {

    public static void brute_force(int[] a, int n) {
        int[] mark = new int[n];
        for (int i = 0; i < n; i++) {
            mark[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] == a[i]) {
                        mark[j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void better(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for (int val : a) {
            hs.add(val);
        }
        for (int val : hs) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 9, 3, 1, 3, 9 };
        brute_force(a, a.length);
        System.out.println();
        better(a);
    }
}
