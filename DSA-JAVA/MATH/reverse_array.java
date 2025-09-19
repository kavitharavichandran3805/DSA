import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
