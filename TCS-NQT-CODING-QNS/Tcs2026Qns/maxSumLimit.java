
//find the maximum sum of any subset of an array which should be <= given maxSum

import java.util.HashMap;
import java.util.Scanner;

public class maxSumLimit {

    static HashMap<String, Integer> dp = new HashMap<>();

    public static int getMaxSum(int[] a, int idx, int cur, int max) {
        if (cur > max)
            return 0;
        if (idx == a.length)
            return cur;
        String key = idx + "," + cur;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        int inc = getMaxSum(a, idx + 1, cur + a[idx], max);
        int exc = getMaxSum(a, idx + 1, cur, max);
        int res = Math.max(inc, exc);
        dp.put(key, res);
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int maxSum = scan.nextInt();
        System.out.println(getMaxSum(a, 0, 0, maxSum));

        scan.close();
    }
}
