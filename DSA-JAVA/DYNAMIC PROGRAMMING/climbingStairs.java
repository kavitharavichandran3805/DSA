// Problem

// You can climb 1 or 2 steps at a time.

// Find how many distinct ways to reach the 5th stair.

// Test Case
// Input: n = 5
// Output: 8

import java.util.*;

public class climbingStairs {

    public static int recursion(int n) {
        if (n == 1)
            return 1;// no of ways to climb 1 steps
        if (n == 2)
            return 2;
        return recursion(n - 1) + recursion(n - 2);
    }

    static int[] dp = new int[1000];

    public static int recursion_dp(int n) {
        if (n == 1)
            return 1;// no of ways to climb 1 steps
        if (n == 2)
            return 2;
        if (dp[n] > 0) {
            return dp[n];
        }
        int result = recursion(n - 1) + recursion(n - 2);
        dp[n] = result;
        return result;
    }

    public static int loops(int n) {
        int curr = 0;
        int prev1 = 1, prev = 2;
        for (int i = 2; i < n; i++) {
            curr = (prev + prev1);
            prev1 = prev;
            prev = curr;

        }

        return curr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(recursion(n));
        System.out.println(recursion_dp(n));
        System.out.println(loops(n));
        scan.close();
    }
}
