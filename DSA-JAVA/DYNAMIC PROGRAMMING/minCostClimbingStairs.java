
// Min Cost Climbing Stairs
// Problem

// Each stair has cost:

// [10, 15, 20]

// Find minimum cost to reach top.

// You can climb 1 or 2 steps.

// Test Case
// Input: cost = [10,15,20]
// Output: 15

import java.util.*;

public class minCostClimbingStairs {

    public static int recursion(int[] a, int i) {
        return 0;
    }

    static int[] dp = new int[1000];

    public static int recursion_dp(int[] a, int i) {
        if (i == 0)
            return a[0];
        if (i == 1)
            return a[1];
        if (dp[i] > 0) {
            return dp[i];
        }
        dp[i] = Math.min(recursion_dp(a, i - 1), recursion_dp(a, i - 2)) + a[i];
        return dp[i];
    }// wrong

    public static int loops(int[] a, int n) {
        int[] minCost = new int[n];
        minCost[0] = a[0];
        minCost[1] = a[1];
        for (int i = 2; i < n; i++) {
            minCost[i] = Math.min(minCost[i - 1], minCost[i - 2]) + a[i];
        }
        return Math.min(minCost[n - 1], minCost[n - 2]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(recursion(a, 0));
        System.out.println(recursion_dp(a, 0));
        System.out.println(loops(a, n));
        scan.close();
    }
}
