import java.util.HashMap;

public class largest_subarray_with_sumk {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 6;
        System.out.println(brute(a, k, a.length));
        System.out.println(better(a, k, a.length));
        System.out.println(optimal(a, k, a.length));

    }

    // brute force

    public static int brute(int[] a, int k, int n) {
        int len = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    // better(works for 0's,-ve,+ve) if the array has negative values use this
    // otehrewise use the optimal approach

    public static int better(int[] a, int k, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, len = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == k) {
                len = Math.max(len, i + 1);
            }
            int rem = sum - k;
            if (hm.containsKey(rem)) {
                int length = i - hm.get(rem);
                len = Math.max(len, length);
            }
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }
        return len;
    }

    // optimal(works for 0's and +ve)

    public static int optimal(int[] a, int k, int n) {
        int left = 0, right = 0;
        int len = Integer.MIN_VALUE;
        int sum = a[0];
        while (right < n) {
            while (sum > k && left <= right) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                len = Math.max(len, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += a[right];
            }
        }
        return len;
    }
}
