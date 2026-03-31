import java.util.*;

// Problem Statement: You are given an integer. Your task is to replace all the zeros in the integer with ones.

// Examples:

// Example 1:
// Input: N = 102003
// Output: 112113
// Explanation: The 2nd,4th and 5th position from left contain 0.The resultant integer has replaced the 0’s in those  positions with 1.

// Example 2:
// Input:  204
// Output: 214
// Explanation: The 2nd position from left contain 0. The resultant integer has replaced the 0 in that position with 1.
public class _32_replace0s1s {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                sb.append("1");
            } else {
                sb.append(rem);
            }
            n /= 10;
        }
        int val = Integer.parseInt(sb.reverse().toString());
        System.out.println(val);
        scan.close();
    }
}
