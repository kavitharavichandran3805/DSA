public class kadane_algo {
    public static void main(String[] args) {
        // maximum subarray sum
        int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int sum = 0, start = 0, ansStart = -1, ansEnd = -1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += a[i];
            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(ansStart + " " + ansEnd);
    }
}
