import java.util.Arrays;

public class move_zeros_toend {
    public static void main(String[] args) {
        int[] a = { 1, 2, 0, 0, 0, 3, 4, 0, 6, 0, 3 };
        int left = 0, temp;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                temp = a[i];
                a[i] = a[left];
                a[left] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
