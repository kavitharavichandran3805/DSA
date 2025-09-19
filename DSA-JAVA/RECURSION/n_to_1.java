import java.util.Scanner;

public class n_to_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        func(n);
        scan.close();
    }

    public static void func(int n) {
        if (n == 1) {
        System.out.println(n);
        return;
        }
        System.out.println(n);
        func(n - 1);
    }
}
