import java.util.*;
// Problem Statement

// Find the Longest Common Prefix among a set of strings.

// Given an array of n strings, find the longest prefix string that is common to all the strings.
// If there is no common prefix, return an empty string "".

// A prefix is the starting part of a string.

// Example 1

// Input

// n = 3
// str = ["flower", "flow", "flight"]

// Output

// fl
public class _5_longestPrefix {

    public static String getPrefix(String[] str, int n) {
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scan.next();
        }
        System.out.println(getPrefix(str, n));
        scan.close();
    }
}
