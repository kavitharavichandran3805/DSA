public class _22_searchElementArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6, 8, };
        int ele = 6;
        int low = 0, high = a.length - 1;
        int mid, ans = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (a[mid] > ele) {
                high = mid - 1;
            } else if (a[mid] < ele) {
                low = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }
        System.out.println(ans);
    }
}
