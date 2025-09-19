public class hollowUpDown {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (i + j == n - 1 || j == 0 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
