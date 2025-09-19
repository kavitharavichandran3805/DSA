import java.util.HashMap;
import java.util.Arrays;

public class twoSum {

    public static int[] getTwoSum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = k - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { i, map.get(diff) };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = { 2, 7, 11, 15 };
        int t = 9;
        System.out.println(Arrays.toString(getTwoSum(a, t)));
    }
}