import java.util.Scanner;
// Problem Statement: Given a String remove all the duplicate characters from the given String.

// Examples
// Input: s = "bcabc"
// Output: "bca" 
// Explanation: Duplicate characters 'b' and 'c' are removed
// Input: s = "cbacdcbc" 
// Output: "cbad"
// Explanation: Duplicate characters 'b' and 'c' are removed
public class _19_removeDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.toString().indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
        scan.close();
    }
}
