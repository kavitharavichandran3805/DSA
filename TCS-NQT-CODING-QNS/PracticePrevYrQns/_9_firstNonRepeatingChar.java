// Problem Statement:

// Given a string s, find the first character that does not repeat anywhere in the string. If all characters repeat, return some indication (e.g., -1 or "None").

// The string can contain letters, digits, or special characters.

// The search is case-sensitive ('A' and 'a' are different).

// Input

// A single string s.

// Constraints: 1 <= s.length <= 10^5

// Output

// The first non-repeating character in the string.

// Or -1 if no such character exists.

// Example 1

// Input:

// leetcode

// Output:

// l

// Explanation:
// l appears only once and comes before any other non-repeating character.

// Example 2

// Input:

// aabbcc

// Output:

// -1

// Explanation:
// All characters repeat → no non-repeating character.

// Example 3

// Input:

// swiss

// Output:

// w

// Explanation:
// s repeats, w occurs only once → first non-repeating.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _9_firstNonRepeatingChar {

    public static String getChar(String input) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        for (char ch : input.toCharArray()) {
            if (hm.get(ch) == 1) {
                return Character.toString(ch);
            }
        }
        return "-1";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        System.out.println(getChar(input));

    }
}
