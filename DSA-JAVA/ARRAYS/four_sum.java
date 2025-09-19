import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum {
    public static void main(String[] args) {
        int[] a = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> l = fourSum(a, target);
        System.out.println(l);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;
                long t = (long) target - (long) nums[i] - (long) nums[j];
                while (k < l) {
                    long sum = (long) nums[k] + (long) nums[l];
                    if (sum == t) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        ++k;
                        --l;

                        while (k < l && nums[k] == nums[k - 1]) {
                            ++k;
                        }
                        while (k < l && nums[l] == nums[l + 1]) {
                            --l;
                        }
                    } else if (sum > t) {
                        --l;
                    } else {
                        ++k;
                    }
                }
            }
        }
        return list;
    }
}
