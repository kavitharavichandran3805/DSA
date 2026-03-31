
// Description:
// A warehouse receives N boxes, each having a weight. The manager wants to form pairs such that:

// Each pair must have equal total weight.

// Each box can be used only once.

// If it is impossible to pair all boxes this way → print -1.

// Otherwise, print:The number of pairs formed.
// Input Format:N
// w1 w2 w3 ... wN
// Test Case Example:Input: 4, 1 2 2 1Logic: Pairs (1,2) and (1,2) both sum to 3. Total pairs = 2.Output: 2
import java.util.*;

public class _19_warehouseBoxArrangement {

    public static int getTotalPairs(int[] a, int n) {
        if (n % 2 == 0) {
            Arrays.sort(a);
            int left = 0, right = n - 1;
            int target = a[0] + a[n - 1];
            int pairs = 0;
            while (left < right) {
                if (a[left] + a[right] != target) {
                    return -1;
                }
                ++pairs;
                ++left;
                --right;
            }
            return pairs;

        }
        return -1;
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
        System.out.println(getTotalPairs(nums, n));
        scan.close();
    }
}
