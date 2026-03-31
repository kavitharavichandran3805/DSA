import java.util.*;

// Check if array is subset of another array

// 1

// Problem Statement: Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array..

// Examples

// Example 1:
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [2,4,3,1,7,5,15]
// Output: arr1[] is a subset of arr2[]

// Example 2:
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [4,5,2]
// Output: arr1[] is not a subset of arr2[]

// Example 3:
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [11,12,13,15,16]
// Output: arr1[] is not a subset of arr2[]

public class _23_subsetArray {
    public static void main(String[] args) {

        int a1[] = { 1, 3, 4, 5, 2 };
        int a2[] = { 2, 4, 3, 1, 7, 5, 15 };

        HashMap<Integer, Integer> map = new HashMap<>();

        // store frequencies of a2
        for (int num : a2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : a1) {

            if (!map.containsKey(num) || map.get(num) == 0) {
                System.out.println("False");
                return;
            }

            map.put(num, map.get(num) - 1);
        }

        System.out.println("True");
    }
}