import java.util.Scanner;
// Problem Statement: Given a string, print non-repeating characters of the string.

// Examples
// Example 1:
// Input:
//  string = "google"  
// Output:
//  l,e  
// Explanation:
//   Non-repeating characters are l, e.

public class _11_nonRepeating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            if (ch == ' ')
                continue;
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.print((char) ('a' + i) + " ");
            }
        }
        scan.close();
    }
}
