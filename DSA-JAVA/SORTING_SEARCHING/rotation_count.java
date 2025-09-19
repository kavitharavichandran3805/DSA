public class rotation_count {
    public static int pivot(int a[]) {
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && a[mid] > a[mid + 1]) {
                return mid;
            }
            if (mid > s && a[mid] < a[mid - 1]) {
                return mid - 1;
            }
            if (a[s] >= a[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int a[] = { 4, 5, 6, 7, 0, 1, 2 };
        int pivotValue = pivot(a);
        System.out.println(pivotValue + 1);
    }
}
