import java.util.ArrayList;

public class KMPAlgorithm {
    public static void main(String[] args) {
        String text = "ABABABCABABC";
        String pattern = "ABABC";
        System.out.println(KMPsearch(text, pattern));
    }

    public static ArrayList<Integer> KMPsearch(String text, String pattern) {
        ArrayList<Integer> a = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        int[] lps = new int[m];
        computeLPS(pattern, lps, m);
        int i = 0, j = 0;
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                a.add((i - j));
                j = lps[j - 1];
            } else if (i < n && (pattern.charAt(j) != text.charAt(i))) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return a;
    }

    public static void computeLPS(String pattern, int[] lps, int m) {
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}
