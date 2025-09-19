public class _1diamondPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 2 * n; i++) {
            int sp = i >= n ? i - n : n - i - 1;
            int st = i >= n ? 2 * n - i - 1 : i;
            for (int k = 0; k < sp; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= st; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}