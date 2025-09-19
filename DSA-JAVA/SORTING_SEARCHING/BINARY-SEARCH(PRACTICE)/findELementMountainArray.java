public class findELementMountainArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 6, 4, 3, };
        int t = 3;
        System.out.println(findEleMountainArray(a, t));
    }

    public static int findEleMountainArray(int[] a, int t) {
        int peakIndex = findPeakIndex(a);
        int firstHalf = bs(a, t, 0, peakIndex);
        if (firstHalf == -1) {
            int secondHalf = bs(a, t, peakIndex + 1, a.length - 1);
            if (secondHalf != -1) {
                return secondHalf;
            }
        } else {
            return firstHalf;
        }
        return -1;
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
        return s;
    }

    public static int bs(int[] a, int t, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == t) {
                return mid;
            } else {
                if (a[s] > a[e]) {
                    if (a[mid] > t) {
                        s = mid + 1;
                    } else {
                        e = mid - 1;
                    }
                } else {
                    if (a[mid] > t) {
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

}
