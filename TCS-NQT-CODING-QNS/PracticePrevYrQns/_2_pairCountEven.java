import java.io.*;
import java.util.*;
// Problem Statement

// Given an array of integers of size N, count the number of pairs (i, j) such that:

// i < j

// (arr[i] + arr[j]) % 2 == 0

// In other words, count pairs whose sum is even.

// Input

// First line: integer N

// Second line: N integers

// Output

// Number of valid pairs.

// Test Cases

// Test Case 1

// Input
// 5
// 1 2 3 4 5

// Output
// 4

// Explanation
// Valid pairs:

// (1,3) (1,5) (2,4) (3,5)
public class _2_pairCountEven {

    public static int approach1(int[] a, int n) {
        int ct = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((a[i] + a[j]) % 2 == 0) {
                    ++ct;
                }
            }
        }
        return ct;
    }

    public static int approach2(int[] a, int n) {
        int oddct = 0, evenct = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                ++evenct;
            } else {
                ++oddct;
            }
        }

        int evenpairs = evenct * (evenct - 1) / 2;
        int oddpairs = oddct * (oddct - 1) / 2;
        return oddpairs + evenpairs;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        System.out.println(Arrays.toString(a));
        System.out.println(approach1(a, n));
        System.out.println(approach2(a, n));

    }
}
