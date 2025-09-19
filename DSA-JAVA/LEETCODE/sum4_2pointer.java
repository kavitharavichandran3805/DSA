import java.util.*;;

public class sum4_2pointer {

    public static List<List<Integer>> getSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int sum = 0, i, j, k, l;
        int n = nums.length;
        for (i = 0; i < n; i++) {
            j = i + 1;
            k = n - 1;
            l = n - 2;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k] + nums[l];
                System.out.println(
                        "The sum is " + sum + " - For the values of a[i],a[j],a[k],a[l]" + nums[i] + " " + nums[j]
                                + " " + nums[k] + " " + nums[l]);
                if (sum == target) {
                    temp.addAll(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    result.add(temp);
                    break;
                } else if (sum > target) {
                    --k;
                } else {
                    ++j;
                }

            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> l = getSum(nums, target);
        for (List<Integer> list : l) {
            for (Integer ele : list) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
