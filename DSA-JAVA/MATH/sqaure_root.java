public class sqaure_root {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(sqrt(n, p));
    }

    public static double sqrt(int n, int p) {
        double root = 0.0;
        int s = 0, e = n, m;
        while (s <= e) {
            m = s + (e - s) / 2;
            if (m * m == n) {
                return (double) m;
            } else if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        root = (double) e;
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;

    }
}
