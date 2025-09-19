public class maxConsecOnesIII {
    public static int longestOnes(int[] a, int k) {
        int l = 0, r = 0, maxLen = 0, zeros = 0, len;
        while (r < a.length) {
            if (a[r] == 0) {
                ++zeros;
            }
            if (zeros > k) {
                if (a[l] == 0) {
                    --zeros;
                }
                ++l;
            }
            if (zeros <= k) {
                len = r - l + 1;
                maxLen = Math.max(len, maxLen);
            }
            ++r;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(longestOnes(a, k));
    }
}
