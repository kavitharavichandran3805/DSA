import java.util.Scanner;

public class pattern_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1 = 2 * n;
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n1; j++) {
                // int colsRange = Math.min(Math.min(i, j), Math.min(n1 - i, n1 - j));
                // 0 0 0 0 0 0 0 0 0
                // 0 1 1 1 1 1 1 1 0
                // 0 1 2 2 2 2 2 1 0
                // 0 1 2 3 3 3 2 1 0
                // 0 1 2 3 4 3 2 1 0
                // 0 1 2 3 3 3 2 1 0
                // 0 1 2 2 2 2 2 1 0
                // 0 1 1 1 1 1 1 1 0
                // 0 0 0 0 0 0 0 0 0
                int colsRange = n - Math.min(Math.min(i, j), Math.min(n1 - i, n1 - j));
                // 4 4 4 4 4 4 4 4 4
                // 4 3 3 3 3 3 3 3 4
                // 4 3 2 2 2 2 2 3 4
                // 4 3 2 1 1 1 2 3 4
                // 4 3 2 1 0 1 2 3 4
                // 4 3 2 1 1 1 2 3 4
                // 4 3 2 2 2 2 2 3 4
                // 4 3 3 3 3 3 3 3 4
                // 4 4 4 4 4 4 4 4 4
                System.out.print(colsRange + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n1; j++) {
                int colsRange = Math.min(Math.min(i, j), Math.min(n1 - i, n1 - j));
                // 0 0 0 0 0 0 0 0 0
                // 0 1 1 1 1 1 1 1 0
                // 0 1 2 2 2 2 2 1 0
                // 0 1 2 3 3 3 2 1 0
                // 0 1 2 3 4 3 2 1 0
                // 0 1 2 3 3 3 2 1 0
                // 0 1 2 2 2 2 2 1 0
                // 0 1 1 1 1 1 1 1 0
                // 0 0 0 0 0 0 0 0 0
                // int colsRange = n - Math.min(Math.min(i, j), Math.min(n1 - i, n1 - j));
                // 4 4 4 4 4 4 4 4 4
                // 4 3 3 3 3 3 3 3 4
                // 4 3 2 2 2 2 2 3 4
                // 4 3 2 1 1 1 2 3 4
                // 4 3 2 1 0 1 2 3 4
                // 4 3 2 1 1 1 2 3 4
                // 4 3 2 2 2 2 2 3 4
                // 4 3 3 3 3 3 3 3 4
                // 4 4 4 4 4 4 4 4 4
                System.out.print(colsRange + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
