
import java.util.Arrays;

public class subArraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {

        int s = 2;
        int tot_sum = Arrays.stream(nums).sum();
        if (tot_sum % k == 0) {
            return true;
        }
        while (s <= nums.length) {
            System.out.println(s);
            if (generateCombSum(nums, s, k)) {
                return true;
            }
            s += 1;
        }
        return false;
    }

    public static boolean generateCombSum(int[] nums, int s, int k) {
        int sum = 0, i = 0;
        int arr[];

        while (s <= nums.length) {

            arr = Arrays.copyOfRange(nums, i, s);
            System.out.println(s + " " + i);
            System.out.println(Arrays.toString(arr));
            sum = Arrays.stream(arr).sum();
            System.out.println(sum);
            if (sum % k == 0) {
                return true;
            }
            i += 1;
            s += 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int k = 5;
        System.out.println(checkSubarraySum(arr, k));
    }
}
