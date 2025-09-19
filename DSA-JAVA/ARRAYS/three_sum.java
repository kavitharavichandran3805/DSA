import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    public static void main(String[] args) {
        int[] a = { 1, 4, 45, 6, 10, 8, 7, 3 };
        int t = 18;
        Arrays.sort(a);
        int sum = 0;
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < a.length - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            int j = i + 1, k = a.length - 1;
            while (j < k) {
                sum = a[i] + a[j] + a[k];
                if (sum == t) {

                    l.add(Arrays.asList(a[i], a[j], a[k]));
                    ++j;
                    --k;
                    while (j < k && a[j] == a[j - 1]) {
                        ++j;
                    }
                    while (j < k && a[k] == a[k + 1]) {
                        --k;
                    }
                } else if (sum > t) {
                    --k;
                } else {
                    ++j;
                }
            }
        }
        System.out.println(l);
    }
}
