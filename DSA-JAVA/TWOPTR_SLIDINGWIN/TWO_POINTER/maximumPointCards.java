public class maximumPointCards {

    public static int maxScore(int[] a, int k) {
        int l = k - 1, r = a.length - 1;
        int lsum = 0, rsum = 0;
        int result = 0;
        for (int i = 0; i < k; i++) {
            lsum += a[i];
        }
        result = lsum;
        while (l >= 0) {

            lsum = lsum - a[l];
            rsum = rsum + a[r];
            --l;
            --r;
            result = Math.max(lsum + rsum, result);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;
        System.out.println(maxScore(a, k));
    }
}
