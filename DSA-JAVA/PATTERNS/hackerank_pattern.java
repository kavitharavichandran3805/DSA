public class hackerank_pattern {
    public static void main(String[] args) {
        int n = 4;
        int n1 = 2 * n - 1;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                // int colRange = Math.min(Math.min(i, j), Math.min(n1 - i - 1, n1 - j - 1)) +
                // 1;
                int colRange = n - (Math.min(Math.min(i, j), Math.min(n1 - i - 1, n1 - j - 1)));
                System.out.print(colRange + " ");
            }
            System.out.println();
        }
    }
}
