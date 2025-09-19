import java.util.Scanner;

// * * * * *
//  * * * *
//   * * *
//    * * 
//     *
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
public class pattern_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            int cols = i >= n ? i - n + 1 : n - i;
            int spaces = n - cols;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < cols; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
