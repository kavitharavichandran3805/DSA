import java.util.Arrays;

public class allocate_books {
    public static void main(String[] args) {
        int[] a = { 25, 46, 28, 49, 24 };
        int stu = 4;
        System.out.println(getMaxPages(a, a.length, stu));
    }

    public static int getStuCount(int[] a, int pages) {
        int stu = 1;
        int pageStu = 0;
        for (int i = 0; i < a.length; i++) {
            if (pageStu + a[i] <= pages) {
                pageStu += a[i];
            } else {
                stu++;
                pageStu = a[i];
            }
        }
        return stu;
    }

    public static int getMaxPages(int[] a, int n, int m) {
        if (m > n)
            return -1;
        int low = Arrays.stream(a).max().getAsInt();
        int high = Arrays.stream(a).sum();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int stuCount = getStuCount(a, mid);
            if (stuCount > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
