// 3) House Robber
// Problem

// A robber cannot rob adjacent houses.

// Find maximum money from:

// [2, 7, 9, 3, 1]
// Test Case
// Input: nums = [2,7,9,3,1]
// Output: 12

import java.util.*;

public class houseRobber {

    public static int maxScore(int[] a, int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return a[0];
        if (n == 2)
            return Math.max(a[0], a[1]);
        int prev1 = a[1];
        int prev2 = a[0], curr = 0;
        for (int i = 2; i < n; i++) {
            curr = Math.max(prev1, prev2 + a[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(maxScore(a, n));
        scan.close();
    }
}
