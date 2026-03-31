// Description:
// A town has N houses in a row. Each house has a power consumption value. 
// If three consecutive houses have strictly increasing consumption, the grid overloads.

// Task:
// Count how many times an overload happens.

// Input Format:

// N

// a1 a2 a3 ... aN

// Test Case Example:

// Input: 5, 10 20 30 25 40

// Logic: (10, 20, 30) is strictly increasing (Overload 1). (20, 30, 25) is not. (30, 25, 40) is not.

// Output: 1

import java.util.Scanner;

public class _20_powerDridFailure {

    public static int getTotalCount(int[] a, int n) {
        if (n <= 2)
            return 0;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if ((a[i] < a[i + 1] && a[i + 1] < a[i + 2])) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] arr = scan.nextLine().trim().split(" ");
        int[] nums = new int[arr.length];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(getTotalCount(nums, n));
        scan.close();
    }
}
