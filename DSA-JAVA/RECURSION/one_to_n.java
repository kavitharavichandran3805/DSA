import java.util.Scanner;

public class one_to_n {
    static int i = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        func(n);
        scan.close();
    }

    public static void func(int n) {
        if (n == 0) {
            return;
        }
        func(n - 1);
        System.out.println(n);
    }
}
