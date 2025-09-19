import java.util.*;

public class allocate_books {
    public static void main(String[] args) {
        int[] a = { 25, 46, 28, 49, 24 };
        int m = 4;
        System.out.println(allocateBooks(a, m));
    }

    public static int findNoOfStu(int[] a, int pages) {
        int students = 1, pagesStu = 0;
        for (int i = 0; i < a.length; i++) {
            if (pagesStu + a[i] <= pages) {
                pagesStu += a[i];
            } else {
                pagesStu = a[i];
                ++students;
            }
        }
        return students;
    }

    public static int allocateBooks(int[] a, int m) {
        int low = Arrays.stream(a).max().getAsInt();
        int high = Arrays.stream(a).sum();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int students = findNoOfStu(a, mid);
            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;

    }
}
