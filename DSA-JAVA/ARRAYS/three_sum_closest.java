import java.util.Arrays;

public class three_sum_closest {
    public static void main(String[] args) {
        int[] a = { -1, 2, 1, -4 };
        int t = 1;
        Arrays.sort(a);
        int sum = 0, j, k;
        int minSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 2; i++) {
            j = i + 1;
            k = a.length - 1;
            while (j < k) {
                sum = a[i] + a[j] + a[k];
                int diff = Math.abs(sum - t);
                if (diff < minDiff) {
                    minDiff = diff;
                    minSum = sum;
                }
                if (sum == t) {
                    System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    return;
                } else if (sum > t) {
                    --k;
                } else {
                    ++j;
                }
            }
        }
        System.out.println(minSum);
    }
}
