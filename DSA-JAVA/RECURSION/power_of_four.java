import java.util.Scanner;

public class power_of_four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        System.err.println(power(n, 0));
        scan.close();
    }

    public static boolean power(int n, int p) {
        if (n == Math.pow(4, p)) {
            return true;
        }
        if (n < Math.pow(4, p)) {
            return false;
        }
        return power(n, p + 1);
    }
}
