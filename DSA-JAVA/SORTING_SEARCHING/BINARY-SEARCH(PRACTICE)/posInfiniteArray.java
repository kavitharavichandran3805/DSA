public class posInfiniteArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// consider this as an infinite array
        int t = 5;
        System.out.println(findElement(a, t));

    }

    public static int findElement(int[] a, int t) {
        int s = 0, e = 1;
        while (t > a[e]) {
            int newStart = e + 1;
            e = e + (e - s + 1) * 2;
            s = newStart;
        }

        return binarySearch(a, s, e, t);

    }

    public static int binarySearch(int[] a, int s, int e, int t) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == t) {
                return mid;
            } else if (a[mid] > t) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
