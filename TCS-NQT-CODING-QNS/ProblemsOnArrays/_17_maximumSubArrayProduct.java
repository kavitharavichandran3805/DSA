// Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

// Examples

// Example 1:
// Input:
//  Nums = [1,2,3,4,5,0]
// Output:
//  120
// Explanation:
//  In the given array, we can see 1×2×3×4×5 gives maximum product value.

// Example 2:
// Input:
//  Nums = [1,2,-3,0,-4,-5]
// Output:
//  20
// Explanation:
//  In the given array, we can see (-4)×(-5) gives maximum product value.

public class _17_maximumSubArrayProduct {
    public static void main(String[] args) {
        int[] a = { 2, 3, 0, 4, 5, 3, 0, 7, 2 };
        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        int i = 0, j = a.length - 1;
        while (i < a.length && j >= 0) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;
            prefix *= a[i];
            suffix *= a[j];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
            ++i;
            --j;
        }
        System.out.println(maxProduct);

    }
}
