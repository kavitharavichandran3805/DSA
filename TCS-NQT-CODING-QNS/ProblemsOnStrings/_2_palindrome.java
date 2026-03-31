import java.util.*;

public class _2_palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        if (s.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scan.close();
    }
}