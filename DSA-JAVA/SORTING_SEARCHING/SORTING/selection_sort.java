import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(int[] a) {
        int last, max, temp;
        for (int i = 0; i < a.length; i++) {
            last = a.length - i - 1;
            max = getmax(a, 0, last);
            temp = a[max];
            a[max] = a[last];
            a[last] = temp;
        }
    }

    public static int getmax(int[] a, int s, int e) {
        int max = a[0];
        int index = 0;
        for (int i = s; i <= e; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }
}
