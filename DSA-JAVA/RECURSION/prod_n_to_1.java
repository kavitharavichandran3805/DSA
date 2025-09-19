import java.util.Scanner;

public class prod_n_to_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        int prod = func(n);
        System.out.println("The product is " + prod);
        scan.close();
    }

    public static int func(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * func(n - 1);
    }
}
