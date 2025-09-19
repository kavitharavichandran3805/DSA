public class rotated_bn_withDuplicates {

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return bn(nums, target, 0, nums.length - 1);
        } else if (nums[pivot] == target) {
            return pivot;
        } else if (nums[0] <= target) {
            return bn(nums, target, 0, pivot - 1);
        }
        return bn(nums, target, pivot + 1, nums.length - 1);
    }

    public static int findPivot(int[] a) {
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && a[mid] > a[mid + 1]) {
                return mid;
            } else if (mid > s && a[mid] < a[mid - 1]) {
                return mid - 1;
            } else if (a[s] > a[s + 1]) {
                return s;
            }
            s++;
            if (a[e] < a[e - 1]) {
                return e - 1;
            }
            e--;
            if (a[s] < a[mid] || (a[s] == a[mid]) && a[s] > a[e]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static int bn(int[] a, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (target > a[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 4, 4, 5, 6, 7, 0, 1, 2 };
        int res = search(a, 6);
        System.out.println(res);

    }
}
