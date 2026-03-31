import java.util.*;

// Find all Symmetric Pairs in the array of pairs

// 1

// Problem Statement: Given an array of pairs, find all the symmetric pairs in the array.

// Examples
// Example 1:
// Input:
//  (1,2),(2,1),(3,4),(4,5),(5,4)
// Output:
//  (2,1) (5,4)
// Explanation:
//  Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

// Example 2:
// Input:
//  (1,5),(2,3),(4,2),(5,1),(2,4)
// Output:
//  (2,4) (5,1)
// Explanation:
//  Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.

public class _16_symmetricPairs {

    public static void optimal(int[][] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int first, second;
        for (int[] a : arr) {
            first = a[0];
            second = a[1];
            if (hm.get(second) != null && hm.get(second) == first) {
                System.out.print("(" + first + " " + second + ") ");
            } else {
                hm.put(first, second);
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2 },
                { 5, 6 },
                { 8, 4 },
                { 2, 1 },
                { 4, 5 },
                { 7, 6 },
                { 6, 5 }
        };
        optimal(a);
    }
}
