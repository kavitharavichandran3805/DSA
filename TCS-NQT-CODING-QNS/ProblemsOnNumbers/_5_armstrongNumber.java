// Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

// Examples
//                 Example 1:
//                 Input:N = 153

//                 Output:True

//                 Explanation: 13+73+33 = 1 + 125 + 27 = 153

//                 Example 2:
//                 Input:N = 371                

//                 Output: True

//                 Explanation: 33+73+13 = 27 + 343 + 1 = 371

import java.util.*;

public class _5_armstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n = num, rem, sum = 0;
        int length = (int) Math.log10(n) + 1;
        while (n > 0) {
            rem = n % 10;
            sum += Math.pow(rem, length);
            n /= 10;
        }
        if (sum == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scan.close();
    }
}
