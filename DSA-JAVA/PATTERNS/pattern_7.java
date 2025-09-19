import java.util.Scanner;

// *****
//  ****
//   ***
//    **
//     *
public class pattern_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
