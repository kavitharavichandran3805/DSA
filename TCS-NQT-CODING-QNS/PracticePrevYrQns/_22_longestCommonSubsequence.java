// 1. Subsequence vs. Substring
// Before diving in, it’s crucial to know the difference:

// Substring: Must be a continuous slice of the string. 
// (e.g., in "ABCDE", "ABC" is a substring).

// Subsequence: Characters must appear in the same order, but can have gaps. 
// (e.g., in "ABCDE", "ACE" is a subsequence).

// 2. The Logic
// Imagine you have two strings:

// String A: stone

// String B: longest

// The LCS here is "one" (length 3).

// s t o n e

// l o n g e s t

// Even though "longest" has an 's' and 't', they appear after the 'o', 'n', and 'e', 
// so they don't count toward a common subsequence starting with 'o'.

import java.util.*;

public class _22_longestCommonSubsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        int n = first.length();
        int m = second.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        System.out.println(dp[m][n]);
        scan.close();
    }
}
