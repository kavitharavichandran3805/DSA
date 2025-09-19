public class newton_raphson {
    public static void main(String[] args) {
        System.out.println(raphson_sqrt(20));
    }

    public static double raphson_sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.1) {
                break;
            }
            x = root;
        }
        return root;
    }
}
