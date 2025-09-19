import java.util.Scanner;

// 1 1 1 1 1
// 2 2 2 2
// 3 3 3
// 4 4 
// 5
public class pattern_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
