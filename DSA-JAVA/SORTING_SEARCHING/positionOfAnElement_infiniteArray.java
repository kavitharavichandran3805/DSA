public class positionOfAnElement_infiniteArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        int index = ans(a, target);
        System.out.println(index);
    }

    static int ans(int[] a, int target) {
        int start = 0;
        int end = 1;
        while (target > a[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarysearch(a, target, start, end);
    }

    static int binarysearch(int[] a, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}