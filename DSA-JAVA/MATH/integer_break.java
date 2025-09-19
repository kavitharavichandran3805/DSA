public class integer_break {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(getMaxProduct(n));
    }

    public static int getMaxProduct(int n) {
        int result = 1;
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        while (n > 4) {
            result *= 3;
            n -= 3;
        }
        return result * n;
    }
}
