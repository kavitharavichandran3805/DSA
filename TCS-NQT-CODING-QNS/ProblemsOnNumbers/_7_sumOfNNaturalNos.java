import java.util.Scanner;

public class _7_sumOfNNaturalNos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println((n * (n + 1)) / 2);
        scan.close();
    }
}
