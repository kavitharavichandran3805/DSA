public class xor_pair {
    public static void main(String[] args) {
        int ans1 = 0, ans2 = 0;
        int[] a = { 1, 2 };
        int[] b = { 3, 4 };
        if (a.length % 2 != 0) {
            ans1 = xor(a);
        } else {
            ans1 = 0;
        }

        if (b.length % 2 != 0) {
            ans2 = xor(b);
        } else {
            ans2 = 0;
        }
        int result = ans1 ^ ans2;
        System.out.println(result);
    }

    public static int xor(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result ^ a[i];
        }
        return result;
    }
}