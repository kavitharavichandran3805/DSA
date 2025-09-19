import java.util.Scanner;

public class sum_1_to_n {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        int sum = func(n);
        System.out.println("The sum is " + sum);
        scan.close();
    }

    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }
}