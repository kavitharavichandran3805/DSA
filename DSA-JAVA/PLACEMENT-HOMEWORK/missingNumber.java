public class missingNumber {
    public static int missingNum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int sum1 = (n * (n + 1)) / 2;
        return sum1 - sum;

    }

    public static void main(String[] args) {
        int a[] = { 3, 0, 1 };
        System.out.println(missingNum(a));

    }
}
