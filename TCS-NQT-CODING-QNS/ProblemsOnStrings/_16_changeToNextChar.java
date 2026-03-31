// Change every letter with next lexicographic alphabet

// Problem Statement: Given a string, write a program to change every letter in the given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a)

// Examples:

// Example 1:
// Input: string str = “abcdxyz”
// Output: bcdeyza

import java.util.*;

public class _16_changeToNextChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                continue;
            }
            ch[i] = (char) (ch[i] + 1);
        }
        System.out.println(Arrays.toString(ch));
        scan.close();
    }
}
