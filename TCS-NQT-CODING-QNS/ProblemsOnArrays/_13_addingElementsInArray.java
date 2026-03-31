import java.util.*;

public class _13_addingElementsInArray {
    public static void insertBegin(int[] a, int n, int val) {
        for (int i = n - 1; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = val;
    }

    public static void insertEnd(int[] a, int n, int val) {
        a[n] = val;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        Arrays.fill(a, 0);
        int n = 5;
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        System.out.println(Arrays.toString(a));
        insertBegin(a, n, 0);
        System.out.println(Arrays.toString(a));
        insertEnd(a, n, 6);
        System.out.println(Arrays.toString(a));
    }
}
