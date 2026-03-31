import java.util.Scanner;
// Problem Statement: Given a String, find the largest word in the string.

// Examples
// Example 1:
// Input:
//  string s = "Google Doc"  
// Output:
//  "Google"  
// Explanation:
//   "Google" is the largest word in the given string.

// Example 2:
// Input:
//  string s = "Microsoft Teams"  
// Output:
//  "Microsoft"  
// Explanation:
//   "Microsoft" is the largest word in the given string.
public class _20_largestWord {

    public static String getLargestWord(String s) {
        String result = "";
        String[] a = s.split(" ");
        int len = 0, maxLen = Integer.MIN_VALUE;
        for (String word : a) {
            len = word.length();
            if (len > maxLen) {
                maxLen = len;
                result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        System.out.println(getLargestWord(s1));
        scan.close();
    }
}
