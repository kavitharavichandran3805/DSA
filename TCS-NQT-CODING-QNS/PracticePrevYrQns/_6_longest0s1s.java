import java.io.*;
import java.util.*;
// find the longest valid subarray where the number of 1s and 0s should be same
//  the array only contains 0s and 1s

//solution
// consider 0 -> -1 , 1 -> +1, so we have to find the longest subarray with sum=0
public class _6_longest0s1s {

    public static int getMaxSubarray(int[] a, int n) {
        int maxLen = Integer.MIN_VALUE, sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            if (hm.containsKey(sum)) {
                int len = i - hm.get(sum);
                maxLen = Math.max(maxLen, len);
            } else {
                hm.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        System.out.println(getMaxSubarray(a, n));
    }
}
