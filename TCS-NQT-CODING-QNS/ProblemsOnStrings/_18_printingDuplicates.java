
import java.util.Scanner;
// Problem Statement: Given a string of characters from a to z. Print the duplicate characters(which are occurring more than once) in the given string with their occurrences count.

// Examples
// Input: str= "sinstriiintng"
// Output: [i: 4, n: 3, s: 2, t: 2] 
// Explanation: In the above example, 's' occurs twice, 'i' occurs four times, 't' occurs twice and 'n' occurs thrice. 'r' and 'g' occur only one time and hence are not considered.
// Input: str= "abcdefg"
// Output: []
// Explanation: All characters occur once.
public class _18_printingDuplicates {
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
            if (freq[i] > 1) {
                System.out.println((char) ('a' + i) + "-" + freq[i]);
            }
        }
        scan.close();
    }
}
