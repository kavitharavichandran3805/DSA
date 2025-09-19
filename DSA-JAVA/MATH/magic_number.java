public class magic_number {
    public static void main(String[] args) {
        int n = 5;
        int base = 5;
        int ans = 0, last;
        while (n > 0) {
            last = n & 1;
            ans += last * base;
            base *= 5;
            n = n >> 1;
        }
        System.out.println(ans);
    }
}
