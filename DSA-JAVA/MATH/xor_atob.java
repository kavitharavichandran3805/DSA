public class xor_atob {
    public static void main(String[] args) {
        int a = 3, b = 9;
        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);

        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);

    }

    public static int xor(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        }
        return 0;
    }
}
