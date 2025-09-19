public class noOfSetBits {
    public static void main(String[] args) {
        int n = 11;
        int ct = 0;
        while (n > 0) {
            ++ct;
            n = n - (n & (-n));
        }
        System.out.println(ct);
    }
}
