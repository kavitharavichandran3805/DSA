// Problem Statement: Given two strings, write a program to remove characters from the first string which are present in the second string.

// Examples
// Input: str1 = “abcdef”, str2 = “cefz”
// Output: “abd”
// Explanation: The common characters in both strings are c, e, f.

// Input: str1 = “xyzpw”, str2 = "lmno" 
// Output: “xyzpw”
// Explanation: There are no common characters.

import java.util.Scanner;

public class _17_removeFrom1st {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
        scan.close();
    }
}
