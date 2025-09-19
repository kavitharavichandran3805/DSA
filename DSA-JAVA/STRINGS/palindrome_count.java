import java.util.Arrays;

public class palindrome_count {
    public static void main(String[] args) {
        String sentence = "Madam Arora teaches malayalam";
        sentence = sentence.toLowerCase();
        int ct = 0;
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (getCount(arr[i])) {
                ct = ct + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(ct);
    }

    public static boolean getCount(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
