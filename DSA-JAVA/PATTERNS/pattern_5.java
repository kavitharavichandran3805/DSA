import java.util.Scanner;

// *
// * *
// * * *
// * * * *
// * * * * * 
// * * * *
// * * *
// * *
// *
public class pattern_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < 2 * n; i++) {
            int totalCols = (i > n) ? 2 * n - i : i;
            for (int j = 0; j < totalCols; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        scan.close();
    }
}
