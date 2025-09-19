import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] result = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
        int[] arr2 = { 9, 8, 7, 6, 5 };
        System.out.println(Arrays.toString(arr2));
        mergeSortRec(arr2, 0, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] mergeSort(int[] a) {
        if (a.length == 1) {
            return a;
        }
        int mid = a.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));// mid not inclusice
        int[] right = mergeSort(Arrays.copyOfRange(a, mid, a.length));
        return merge(left, right);

    }

    public static int[] merge(int[] l, int[] r) {
        int[] result = new int[l.length + r.length];
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                result[k] = l[i];
                i++;
            } else {
                result[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < l.length) {
            result[k] = l[i];
            i++;
            k++;
        }

        while (j < r.length) {
            result[k] = r[j];
            j++;
            k++;
        }

        return result;
    }

    public static void mergeSortRec(int[] a, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSortRec(a, s, mid);
        mergeSortRec(a, mid, e);
        mergerec(a, s, mid, e);
    }

    public static void mergerec(int[] a, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s, j = m, k = 0;
        while (i < m && j < e) {
            if (a[i] < a[j]) {
                mix[k] = a[i];
                i++;
            } else {
                mix[k] = a[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = a[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = a[j];
            j++;
            k++;
        }
        for (int n = 0; n < mix.length; n++) {
            a[s + n] = mix[n];
        }
    }
}