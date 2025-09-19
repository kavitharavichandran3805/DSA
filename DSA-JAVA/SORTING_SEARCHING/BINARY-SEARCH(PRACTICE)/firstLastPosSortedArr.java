import java.util.*;

public class firstLastPosSortedArr {
    public static void main(String[] args) {
        int[] a = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int t = 8;
        System.out.println((Arrays.toString(findPos(a, t))));
    }

    public static int[] findPos(int[] a, int t) {
        int firstIndex = binarySearch(a, t, true);
        int lastIndex = binarySearch(a, t, false);
        return new int[] { firstIndex, lastIndex };
    }

    public static int binarySearch(int[] a, int t, boolean findFirstIndex) {
        int s = 0, e = a.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == t) {
                ans = mid;
                if (findFirstIndex) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else if (a[mid] > t) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
