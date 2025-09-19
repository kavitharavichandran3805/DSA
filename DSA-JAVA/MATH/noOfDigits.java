public class noOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
        int ct = 0;
        while (n > 0) {
            n = n >> 1;
            ++ct;
        }
        System.out.println(ct);
    }
}
