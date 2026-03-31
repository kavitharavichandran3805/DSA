import java.util.*;

// | Approach | Method                             | Time Complexity       | Space Complexity | Notes                                             |
// | -------- | ---------------------------------- | --------------------- | ---------------- | ------------------------------------------------- |
// | 1        | HashMap + Custom Sort              | O(n log n + m)        | O(n + m)         | Works for any integers, duplicates handled        |
// | 2        | HashMap frequency + remaining sort | O(n log n) worst case | O(n)             | Works for any integers, requires sorting leftover |
// | 3        | Counting sort (frequency array)    | O(n)                  | O(n)             | Fastest, **only works if 0 ≤ elements ≤ 1000**    |

// Problem Statement

// You are given two arrays of integers:

// arr1[] of size N

// arr2[] of size M

// All elements of arr2[] are distinct and also appear in arr1[].

// Your task is to sort arr1[] such that:

// The relative order of elements in arr1 follows the order given in arr2.

// Elements that do not appear in arr2 should be placed at the end of the array.

// These remaining elements should be sorted in ascending order.

// Example 1

// Input

// arr1 = {2,1,2,5,7,1,9,3,6,8,8}
// arr2 = {2,1,8,3}

// Output

// 2 2 1 1 8 8 3 5 6 7 9

// Explanation

// Order defined by arr2:

// 2 → 1 → 8 → 3

// So:

// All 2s first

// then 1s

// then 8s

// then 3

// Remaining elements:

// 5,6,7,9

// Sorted and placed at the end.

// Example 2

// Input

// arr1 = {10,20,30,40}
// arr2 = {40,10}

// Output

// 40 10 20 30

// Explanation

// Elements in arr2 come first in that order.

// Remaining elements {20,30} are sorted.

public class _25_sortArrayDefinedByAnotherArray {

    public static int[] approach1(int[] a, int[] b) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            if (!hm.containsKey(b[i])) {
                hm.put(b[i], i);
            }
        }
        Integer[] temp = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, (x, y) -> {
            boolean aIn = hm.containsKey(x);
            boolean bIn = hm.containsKey(y);
            if (!aIn && !bIn)
                return Integer.compare(x, y);
            if (!aIn)
                return 1;
            if (!bIn)
                return -1;
            return Integer.compare(hm.get(x), hm.get(y));
        });
        for (int i = 0; i < a.length; i++) {
            a[i] = temp[i];
        }
        return a;
    }

    public static int[] approach2(int[] a, int[] b) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }
        int[] result = new int[a.length];
        int count = 0;
        for (int j = 0; j < b.length; j++) {
            while (hm.get(b[j]) > 0) {
                result[count++] = b[j];
                hm.put(b[j], hm.get(b[j]) - 1);
            }
            hm.remove(b[j]);
        }
        int[] remaining = new int[a.length - count];
        int index = 0;
        for (int num : a) {
            if (hm.containsKey(num)) {
                while (hm.get(num) > 0) {
                    remaining[index++] = num;
                    hm.put(num, hm.get(num) - 1);
                }
                hm.remove(num);
            }
        }
        Arrays.sort(remaining);
        for (int i = 0; i < remaining.length; i++) {
            result[count++] = remaining[i];
        }
        return result;
    }

    public static int[] approach3(int[] a, int[] b) {
        int[] count = new int[1001];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int[] result = new int[a.length];
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            while (count[b[i]] > 0) {
                result[index++] = b[i];
                count[b[i]]--;
            }
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                result[index++] = i;
                count[i]--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int[] b = { 2, 1, 8, 3 };
        int[] result1 = approach1(a, b);
        int[] result2 = approach2(a, b);
        int[] result3 = approach3(a, b);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}
