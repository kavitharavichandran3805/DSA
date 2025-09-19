import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a) {
        int temp;
        boolean swapped;
        for (int i = 0; i < a.length; i++) {
            swapped = false;
            for (int j = 1; j <= a.length - i - 1; j++) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }
}
