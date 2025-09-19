public class peak_index {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 6, 4, 3, 2 };
        System.out.println(findPeakIndex(a));
    }

    public static int findPeakIndex(int[] a) {
        int s = 0, e = a.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (a[mid] > a[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return a[s];
    }
}
