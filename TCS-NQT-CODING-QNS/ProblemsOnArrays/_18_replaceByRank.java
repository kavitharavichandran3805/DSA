// Problem Statement: Given an array of N integers, the task is to replace each element of the array by its rank in the array.

// Examples:

// Example 1:
// Input: 20 15 26 2 98 6
// Output: 4 3 5 1 6 2
// Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

// Example 2:
// Input: 1 5 8 15 8 25 9
// Output: 1 2 3 5 3 6 4
// Explanation: When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so…
import java.util.*;

public class _18_replaceByRank {
    public static void main(String[] args) {
        int arr[] = { 20, 15, 26, 2, 98, 6 };
        int n = arr.length;
        int dummy[] = new int[n];
        for (int i = 0; i < n; i++) {
            dummy[i] = arr[i];
        }
        Arrays.sort(arr);
        int rank = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], rank++);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(hm.get(dummy[i]) + " ");
        }
    }
}
