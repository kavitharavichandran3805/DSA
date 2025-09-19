import java.util.Arrays;

public class productExceptItself {
    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int pro = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        pro *= nums[j];
                        result[j] = 0;
                    }
                }
                result[i] = pro;
                return result;
            }
            product *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = product / nums[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(a)));
    }
}
