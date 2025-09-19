

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.println("Enter the string to be checked");
        s = scan.nextLine();
        int left = 0, right = s.length() - 1;
        boolean result = true;
        while (left < right) {
            if (!(s.charAt(left) == s.charAt(right))) {
                result = false;
            }

            ++left;
            --right;
        }
        System.out.println("The string is a palindrome : " + result);

        scan.close();

    }
}