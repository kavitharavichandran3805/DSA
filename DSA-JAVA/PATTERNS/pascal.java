public class pascal {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int sp = n - 1; sp > i; sp--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(val + " ");
                val = val * (i - k) / (k + 1);
            }
            System.out.println();

        }
    }
}
