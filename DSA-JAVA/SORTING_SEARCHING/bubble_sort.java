import java.util.*;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        bubblesort(a, n);
        System.out.println("After sorting");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        scan.close();
    }

    public static void bubblesort(int[] a, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}