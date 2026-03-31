import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//cryptic number
//should be divisibel by 7, should not be divisible by 5, should not be a palindrome, should not contain repetative digits
public class _13_crypticNumber {

    public static boolean isPalindrome(int n) {
        String s1 = Integer.toString(n);
        StringBuffer sb = new StringBuffer(s1).reverse();
        return s1.equals(sb.toString());
    }

    public static boolean isRepetitive(int n) {
        boolean[] seen = new boolean[10]; // 0-9 digits
        while (n > 0) {
            int digit = n % 10;
            if (seen[digit])
                return true; // digit repeats
            seen[digit] = true;
            n /= 10;
        }
        return false; // no repetition
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        ArrayList<Integer> a = new ArrayList<>();
        int s = Integer.valueOf(input[0]), e = Integer.valueOf(input[1]);
        for (int i = s; i <= e; i++) {
            if (i % 7 == 0 && i % 5 != 0 && !isPalindrome(i) && !isRepetitive(i)) {
                a.add(i);
            }
        }
        if (a.size() == 0) {
            System.out.println("-1");
        } else {
            for (int num : a) {
                System.out.print(num + " ");
            }
        }

    }
}
