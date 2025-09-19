import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] a = { 1, 4, 45, 6, 10, 8 };
        int k = 16;
        Arrays.sort(a);
        int i = 0, j = a.length - 1, sum = 0;
        while (i < j) {
            sum = a[i] + a[j];
            if (sum == k) {
                System.out.println(a[i] + " " + a[j]);
                break;
            } else if (sum > k) {
                --j;
            } else {
                ++i;
            }
        }
    }
}
