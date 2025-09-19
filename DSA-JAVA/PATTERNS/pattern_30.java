import java.util.Scanner;
//       1
//     2 1 2
//   3 2 1 2 3
// 4 3 2 1 2 3 4 

public class pattern_30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int sp = n; sp > i; sp--) {
                System.out.print("  ");
            }
            for (int col = i; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= i; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
