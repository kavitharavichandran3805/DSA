
import java.util.*;
import java.io.*;

//Problem Statement: Reorder Packages by Priority

// In the automated warehouse of TCS Global, packages are identified by a string of color codes. Each code represents a specific priority level:

// Code	Priority Level	Color
// 0	High Priority	Red
// 1	Medium Priority	White
// 2	Low Priority	Blue

// You are given a single string of these codes, separated by commas. Your task is to reorder the packages so that:

// All High Priority (0) items come first.

// Followed by Medium Priority (1) items.

// Finally, Low Priority (2) items.

// Return the reordered string of codes, separated by commas.

// Input

// A single string of integers (0, 1, 2) separated by commas.

// Example
// "0,2,1,2,0,1"
// Output

// A single string of integers, separated by commas, reordered by priority.

// Example
// "0,0,1,1,2,2"

public class _1_012sort {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(",");
        int low = 0, mid = 0, high = input.length - 1;
        // Arrays.sort(input);
        // System.out.println(Arrays.toString(input));

        while (mid <= high) {
            if (input[mid].equals("0")) {
                swap(input, low, mid);
                ++low;
                ++mid;
            } else if (input[mid].equals("1")) {
                ++mid;
            } else {
                swap(input, mid, high);
                --high;
            }
        }
        System.out.println(Arrays.toString(input));
    }

    public static void swap(String[] a, int s, int e) {
        String temp = a[s];
        a[s] = a[e];
        a[e] = temp;
    }
}