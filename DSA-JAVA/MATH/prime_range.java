public class prime_range {
    public static void main(String[] args) {
        int s = 3, e = 50, ct = 0;
        for (int i = s; i <= e; i++) {
            for (int j = 2; j < i; j++) {
                if ((i % j == 0)) {
                    ct = 1;
                    break;
                }
            }
            if (ct == 0) {
                System.out.println(i);
            }
            ct = 0;
        }
    }
}
