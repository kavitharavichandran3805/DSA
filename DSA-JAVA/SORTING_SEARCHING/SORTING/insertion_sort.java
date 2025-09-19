import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
        // String str = "abxabc";
        // String pattern = "abc";
        // System.out.println(str.contains(pattern)); //string pattern matching
    }

    public static void insertionSort(int[] a) {
        int j, temp;
        for (int i = 0; i < a.length; i++) {
            j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                --j;
            }
        }
    }
}
