
public class find_min_rotated_sorted_arr {
    public static void main(String[] args) {
        int[] a = { 2, 2, 2, 2, 3, 3, 3, 3, 1 };
        int res = findMin(a);
        System.out.println(res);

    }

    public static int findMin(int[] nums) {

        int l = 0, h = nums.length - 1;
        if (nums[l] < nums[h]) {
            return nums[l];// the array was never rotated
        }
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] > nums[h]) {
                l = mid + 1;
            } else if (nums[mid] < nums[h]) {
                h = mid;
            } else {
                h--;
            }
        }
        return nums[h];
    }
}
