public class _3_second_smallest_largest {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5, 6, 6 };
        int s = Integer.MAX_VALUE, ss = Integer.MAX_VALUE, l = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > l) {
                sl = l;
                l = a[i];
            }

            if (sl < a[i] && a[i] != l) {
                sl = a[i];
            }

            if (a[i] < s) {
                ss = s;
                s = a[i];
            }

            if (ss > a[i] && a[i] != s) {
                ss = a[i];
            }
        }
        System.out.println("second smallest : " + ss);
        System.out.println("second largest : " + sl);
    }
}
