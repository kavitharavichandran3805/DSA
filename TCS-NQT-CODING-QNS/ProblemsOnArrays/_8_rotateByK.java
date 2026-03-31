// Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

// Examples:

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5} K=2
// Output: {3,4,5,1,2}
// Explanation: Rotate the array to right by 2 elements.

// Example 2:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
// Output: {4,5,6,7,1,2,3}
// Explanation: Rotate the array to right by 3 elements.

// Using a Temporary Array (Extra Space)

// Idea: Copy k elements (for left rotation) or last k elements (for right rotation) into a temporary array, shift the rest, then copy back.

// Time Complexity: O(n)

// Space Complexity: O(k)

// Example (Left Rotate by k):

// A = [1,2,3,4,5], k=2
// Temp = [1,2]
// Shift rest: [3,4,5,_,_]
// Copy temp to end: [3,4,5,1,2]

// 2️⃣ Rotating One by One (Naive Approach)

// Idea: Move elements one by one k times.

// Time Complexity: O(n*k)

// Space Complexity: O(1)

// Use Case: Small arrays or small k.

// Example (Left Rotate by 2):

// [1,2,3,4,5] → [2,3,4,5,1] → [3,4,5,1,2]

// 3️⃣ Reversal Algorithm (In-Place) ✅

// Idea: Reverse parts of the array and then the whole array.

// Time Complexity: O(n)

// Space Complexity: O(1)

// Works for: Both left and right rotations

// Formulas:

// Left rotation by k:

// reverse(a, 0, k-1)
// reverse(a, k, n-1)
// reverse(a, 0, n-1)

// Right rotation by k:

// reverse(a, 0, n-k-1)
// reverse(a, n-k, n-1)
// reverse(a, 0, n-1)

// 4️⃣ Juggling Algorithm (GCD Method, In-Place)

// Idea: Divide array into sets using GCD(n,k). Rotate elements within sets.

// Time Complexity: O(n)

// Space Complexity: O(1)

// Example:

// A = [1,2,3,4,5,6], k=2
// GCD(6,2)=2 → 2 sets
// Set 1: 1 → 3 → 5 → 1
// Set 2: 2 → 4 → 6 → 2

// 5️⃣ Block Swap Algorithm (In-Place)

// Idea: Divide the array into 2 blocks [A|B], swap blocks recursively until rotated.

// Time Complexity: O(n)

// Space Complexity: O(1)

// Steps (Left Rotate by k):

// Divide into A (first k) and B (rest)

// Swap smaller block with equal part of bigger block

// Repeat until sizes equal

// (You already saw this concept in earlier discussion.)

// 6️⃣ Using Circular Array / Modulo Indexing

// Idea: Compute new index (i + k) % n for right rotation or (i - k + n) % n for left rotation.

// Time Complexity: O(n)

// Space Complexity: O(n) if storing result in a new array, O(1) if you move in-place carefully.

// Example (Left Rotate by 2):

// NewArray[i] = A[(i+k)%n]

// 7️⃣ Using Linked List (Optional Approach)

// Idea: Convert array to linked list, adjust links to rotate.

// Time Complexity: O(n)

// Space Complexity: O(n) for list

// Use Case: If array is implemented as a linked list, rotations are O(1) if you just move head pointer.

// ✅ Summary Table
// Method	Time	Space	In-place?	Notes
// Temporary array	O(n)	O(k)	❌	Simple
// One by one	O(n*k)	O(1)	✅	Slow for large k
// Reversal algorithm	O(n)	O(1)	✅	Efficient & easy
// Juggling (GCD)	O(n)	O(1)	✅	Requires understanding of GCD
// Block swap	O(n)	O(1)	✅	Recursive swapping
// Modulo indexing	O(n)	O(n)	❌/✅	Elegant for new array
// Linked list approach	O(n)	O(n)	❌	Only if linked list

import java.util.*;

public class _8_rotateByK {

    public static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            ++start;
            --end;
        }
    }

    public static void leftRotate(int[] a, int k, int n) {
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);
        reverse(a, 0, n - 1);
    }

    public static void rightRotate(int[] a, int k, int n) {
        reverse(a, 0, n - k - 1);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);
    }

    public static void main(String[] main) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 6, 7, 8, 9, 0 };
        int k = 3;
        leftRotate(a, k, a.length);
        rightRotate(b, k, b.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
