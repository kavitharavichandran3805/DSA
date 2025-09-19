import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] a = { 4, 3, 2, 1 };
        sort(a, 4, 0, 0);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (a[c] > a[max]) {
                sort(a, r, c + 1, c);
            } else {
                sort(a, r, c + 1, max);
            }
        } else {
            int temp = a[max];
            a[max] = a[r - 1];
            a[r - 1] = temp;
            sort(a, r - 1, 0, 0);
        }
    }
}
