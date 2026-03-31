// Description:
// You receive a coded message as a string.

// Rules:

// Each digit represents how many times the next character should be repeated.

// If there is no digit before a character → print it once.

// Input Example:

// 3a2b1c

// Output Example:

// aaabbc

// Additional Test Case:

// Input: 2xYz3w

// Output: xxYzwww (Note: Y and z have no digits, so they appear once).

import java.util.*;

//works for single digits
public class _21_messageDecoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = str.length();
        int i = 0;
        while (i < n) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                System.out.print(ch);
                ++i;
            } else if (Character.isDigit(ch) && (i + 1) < n) {
                for (int j = 0; j < Character.getNumericValue(ch); j++) {
                    System.out.print(str.charAt(i + 1));
                }
                i += 2;
            }
        }
        scan.close();
    }
}

// works of multiple digits 12a( the above code prints aa, but it should print
// 12 a's)
// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// String str = scan.nextLine();

// StringBuilder result = new StringBuilder();
// int i = 0, n = str.length();

// while (i < n) {
// if (Character.isDigit(str.charAt(i))) {
// int count = 0;

// while (i < n && Character.isDigit(str.charAt(i))) {
// count = count * 10 + (str.charAt(i) - '0');
// i++;
// }

// if (i < n) {
// for (int j = 0; j < count; j++) {
// result.append(str.charAt(i));
// }
// i++;
// }
// } else {
// result.append(str.charAt(i));
// i++;
// }
// }

// System.out.println(result);
// scan.close();
// }
// }