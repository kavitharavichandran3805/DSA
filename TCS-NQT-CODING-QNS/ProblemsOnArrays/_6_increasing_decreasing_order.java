import java.util.Arrays;

public class _6_increasing_decreasing_order {
    public static void main(String[] args) {
        int[] a = { 4, 2, 8, 6, 15, 5, 9, 20 };
        Arrays.sort(a);
        int i = a.length / 2, j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            ++i;
            --j;
        }
        System.out.println(Arrays.toString(a));
    }
}