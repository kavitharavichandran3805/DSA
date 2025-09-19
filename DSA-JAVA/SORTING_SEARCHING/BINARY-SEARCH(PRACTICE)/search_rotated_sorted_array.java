public class search_rotated_sorted_array {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int t = 3;
        System.out.println(findEleRotSorArr(a, t, false));
        int[] arr = { 2, 3, 9, 2, 2, 2 };
        int target = 3;
        System.out.println(findEleRotSorArr(arr, target, true));

    }

    // for array which dont have duplicate elements

    public static int findEleRotSorArr(int[] a, int t, boolean dup) {
        int pivot;
        if (dup) {
            pivot = findPivotDuplicates(a);
        } else {
            pivot = findPivot(a);

        }
        System.out.println(pivot);
        if (pivot == -1) {
            return bs(a, t, 0, a.length - 1);
        }
        if (a[pivot] == t) {
            return pivot;
        }
        if (t >= a[0]) {
            return bs(a, t, 0, pivot - 1);
        }
        if (t < a[0]) {
            System.out.println("true");
            return bs(a, t, pivot + 1, a.length - 1);
        }
        return -1;
    }

    public static int findPivot(int[] a) {
        int s = 0, e = a.length - 1;
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
            }
            if (a[s] < a[mid]) {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static int bs(int[] a, int t, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == t) {
                System.out.println("mid " + mid);
                return mid;
            } else if (a[mid] > t) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    // for duplicate elements

    public static int findPivotDuplicates(int[] a) {
        int s = 0, e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && a[mid] > a[mid + 1])
                return mid;
            if (mid > s && a[mid] < a[mid - 1])
                return mid - 1;
            if (a[mid] == a[s] && a[mid] == a[e]) {
                if (s < e && a[s] > a[s + 1])
                    return s;
                s++;
                if (e > s && a[e] < a[e - 1])
                    return e - 1;
                e--;
            }
            if (a[s] < a[mid] || (a[s] == a[mid] && a[mid] > a[e])) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

}
