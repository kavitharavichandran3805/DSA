public class powxn {

    public static double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE && x > 1) {
            return 0;
        }
        if (n < 0) {
            n = (-1) * n;
            double ans1 = answer(x, n);
            return 1 / ans1;
        }
        return answer(x, n);

    }

    public static double answer(double x, int n) {
        double ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= x;
            }
            x = x * x;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(3, 6));
    }
}
