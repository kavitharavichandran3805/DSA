import java.util.Scanner;

public class _34_areaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double result = 3.14 * r * r;
        System.out.printf("%.1f", result);
        scan.close();
    }
}
