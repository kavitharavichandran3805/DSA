import java.util.*;

public class longestConsecutiveSequence {
    public static int getCount(int[] a, int n) {
        int curlen = 1, maxlen = 1;
        Arrays.sort(a);
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1] + 1) {
                ++curlen;
            } else if (a[i] != a[i - 1]) {
                curlen = 1;
            }
            maxlen = Math.max(curlen, maxlen);
        }
        return maxlen;

    }

    public static void main(String[] args) {
        int[] a = { 1, 9, 3, 10, 4, 20, 2 };
        int n = 5;
        System.out.println(getCount(a, n));
    }
}
