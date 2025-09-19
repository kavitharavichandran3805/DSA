
public class floor {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6, 7 };
        int t = 2;
        System.out.println(findFloor(a, t));
    }

    public static int findFloor(int[] a, int t) {
        int l = 0, h = a.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a[mid] == t) {
                return a[mid];
            } else if (a[mid] > t) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return a[h];
    }
}
