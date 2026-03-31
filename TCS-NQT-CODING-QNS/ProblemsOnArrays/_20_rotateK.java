import java.util.*;

public class _20_rotateK {

    public static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            ++i;
            --j;
        }
    }

    public static void rotateLeft(int[] a, int k) {
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
        reverse(a, 0, a.length - 1);
    }

    public static void rotateRight(int[] a, int k) {
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - k - 1);
        reverse(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] a = { 3, 7, 8, 9, 10, 11 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateLeft(a, k);
        System.out.println("After left rotation : " + Arrays.toString(a));
        rotateRight(b, k);
        System.out.println("After right rotation : " + Arrays.toString(b));
    }
}
