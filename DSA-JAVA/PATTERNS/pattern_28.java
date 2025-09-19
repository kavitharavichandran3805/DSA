import java.util.Scanner;

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
public class pattern_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // for (int i = 0; i < 2 * n - 1; i++) {
        // int cols = i >= n ? 2 * n - i - 1 : i + 1;
        // int sp = n - cols;
        // for (int j = 0; j < sp; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < cols; k++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        printPattern(n);
        scan.close();
    }

    public static void printPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int cols = i >= n ? 2 * n - i - 1 : i + 1;
            int sp = n - cols;
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < cols; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
