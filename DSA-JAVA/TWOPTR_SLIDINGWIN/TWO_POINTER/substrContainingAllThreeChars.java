import java.util.Arrays;

public class substrContainingAllThreeChars {
    public static void main(String[] args) {

        // brute force
        String s = "abcabc";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[3];
            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j) - 'a'] = 1;
                if ((hash[0] + hash[1] + hash[2] == 3)) {
                    count += 1;
                }
            }
        }
        System.out.println(count);

        // optimal
        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s) {
        int maxLen = 0;
        int r = 0;
        int[] a = new int[3];
        Arrays.fill(a, -1);
        while (r < s.length()) {
            a[s.charAt(r) - 'a'] = r;
            maxLen = maxLen + 1 + Math.min(a[0], Math.min(a[1], a[2]));
            ++r;
        }
        return maxLen;
    }
}
