import java.util.*;
import java.io.*;
// Problem Statement

// A PT teacher arranges students in ascending order of roll numbers in an array a.

// The teacher calls a number R.

// Rules:

// If R exists in the array, return its index.

// If R does not exist, return the index where it should be inserted so that the order remains sorted.

// Input
// N
// R
// array elements
// Output

// Position of the student.

// Test Cases

// Test Case 1

// Input
// 6
// 3
// 1 2 3 4 7 9

// Output
// 2

// Test Case 2

// Input
// 5
// 6
// 1 2 3 4 9

// Output
// 4
public class _3_studentLine {

    public static int getIndex(int[] a, int n, int r) {
        Arrays.sort(a);
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == r) {
                return mid;
            } else if (a[mid] > r) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high + 1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int r = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        System.out.println(getIndex(a, n, r));
    }
}
