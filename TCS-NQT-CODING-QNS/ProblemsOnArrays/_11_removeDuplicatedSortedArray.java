// Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

// Note: Return k after placing the final result in the first k slots of the array.

public class _11_removeDuplicatedSortedArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 2, 3, 3, 3, 4, 5, 5 };
        int j = 0, i = 1;
        while (i < a.length) {
            if (a[i] == a[i - 1]) {
                ++i;
            } else {
                a[++j] = a[i];
                ++i;
            }
        }
        for (int k = 0; k < j + 1; k++) {
            System.out.println(a[k] + " ");
        }
    }
}
