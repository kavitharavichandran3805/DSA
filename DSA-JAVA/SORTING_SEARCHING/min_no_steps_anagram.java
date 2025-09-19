import java.util.*;

public class min_no_steps_anagram {
    public static void main(String[] args) {
        String s = "bab";
        String t = "aba";
        int ans = minSteps(s, t);
        System.out.println(ans);

    }

    public static int minSteps(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String a1 = new String(a);
        String b1 = new String(b);
        System.out.println(a1 + " " + b1);
        if (a1.equals(b1)) {
            return 0;
        }
        int n = a.length;
        int alen = a.length;
        int blen = b.length;
        for (int i = 0; i < alen; i++) {
            for (int j = 0; j < blen; j++) {
                if (a[i] == b[blen - 1]) {
                    --blen;
                    --n;
                    break;
                }
                if (a[i] == b[i]) {
                    for (int k = j; k < blen - 1; k++) {
                        b[k] = b[k + 1];
                    }
                    --blen;
                    --n;
                    break;
                }
            }
        }
        return alen - n;
    }
}
