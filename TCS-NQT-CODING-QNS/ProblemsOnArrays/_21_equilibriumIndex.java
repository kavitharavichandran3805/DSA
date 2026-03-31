import java.util.*;

// Finding Equilibrium index in an array

// 1

// Problem Statement: Given a 0-indexed integer array nums, find the leftmost equilibrium Index.

// An equilibrium Index is an index at which sum of elements on its left is equal to the sum of element on its right. That is, nums[0] + nums[1] + ... + nums[equilibriumIndex-1] == nums[equilibriumIndex+1] + nums[equilibriumIndex+2] + ... + nums[nums.length-1]. If equilibriumIndex == 0, the left side sum is considered to be 0. Similarly, if equilibriumIndex == nums.length - 1, the right side sum is considered to be 0.

// Return the leftmost equilibrium Index that satisfies the condition, or -1 if there is no such index.

// Examples
// Example 1:
// Input:
//  nums = [2, 3, -1, 8, 4]  
// Output:
//  3  
// Explanation:

// The sum of the numbers before index 3 is: 2 + 3 + (-1) = 4  
// The sum of the numbers after index 3 is: 4 = 4  
// Therefore, the output is index 3.

// Example 2:
// Input:
//  nums = [1, -1, 4]  
// Output:
//  2  
// Explanation:

// The sum of the numbers before index 2 is: 1 + (-1) = 0  
// The sum of the numbers after index 2 is: 0  
// Therefore, the output is index 2.
public class _21_equilibriumIndex {

    // time comp - o(2n) space comp - o(2n)
    public static int approach1(int[] a) {
        int left_sum = 0, right_sum = 0;
        int i = 1, j = a.length - 2;
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        left[0] = 0;
        right[a.length - 1] = 0;
        while (i < a.length && j >= 0) {
            left_sum += a[i - 1];
            right_sum += a[j + 1];
            left[i] = left_sum;
            right[j] = right_sum;
            ++i;
            --j;
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for (int index = 0; index < a.length; index++) {
            if (left[index] == right[index]) {
                return index;
            }
        }
        return -1;
    }

    public static int approach2(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int left_sum = 0, right_sum = sum;
        for (int i = 0; i < a.length; i++) {
            right_sum -= a[i];
            if (left_sum == right_sum) {
                return i;
            }
            left_sum += a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] a = { 2, 3, -1, 8, 4 };
        int[] a = { 1, -1, 4 };
        int result = approach1(a);
        System.out.println(result);
        int result1 = approach2(a);
        System.out.println(result1);
    }
}
