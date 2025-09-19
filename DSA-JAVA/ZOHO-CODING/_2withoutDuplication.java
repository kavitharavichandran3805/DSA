import java.util.Arrays;

public class _2withoutDuplication {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 2, 2, 3, 3, 3, 4 };
        int i = 1;

        for (int j = 1; j < a.length; j++) {
            if (a[j] != a[j - 1]) {
                a[i] = a[j];
                ++i;
            }
        }
        for (int ind = i; ind < a.length; ind++) {
            a[ind] = 0;
        }
        System.out.println(Arrays.toString(a));
        for (int ind = 0; ind < i; ind++) {
            System.out.println(a[ind]);
        }

    }
}
