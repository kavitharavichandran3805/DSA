
import java.util.*;
import java.io.*;

// Problem Statement

// Given an array of integers and a number K, find all subarrays whose sum equals K.

// Return the count of such subarrays.

// Input
// N
// array elements
// K
// Output

// Number of subarrays.

// Test Cases

// Test Case 1

// Input
// 5
// 1 2 3 2 5
// 5

// Output
// 2

// Explanation

// [2,3]
// [5]

// Test Case 2

// Input
// 4
// 1 1 1 1
// 2

// Output
// 3

public class _4_allSubarraySumK {

    public static int getCount(int[] a, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, ct = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == k) {
                ++ct;
            }
            int rem = sum - k;
            if (hm.containsKey(rem)) {
                ++ct;
            }
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }
        return ct;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        int k = Integer.parseInt(bf.readLine());
        System.out.println(getCount(a, n, k));
    }
}
