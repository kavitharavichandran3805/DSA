import java.util.Scanner;

public class _43_octalToDecimal {
    public static int approach1(int octal) {
        int decimal = Integer.parseInt(Integer.toString(octal), 8);
        return decimal;
    }

    public static int approach2(int o) {
        int exp = 0, sum = 0;
        while (o > 0) {
            int rem = o % 10;
            sum += (int) Math.pow(8, exp) * rem;
            ++exp;
            o /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int octal = scan.nextInt();
        int result1 = approach1(octal);
        int result2 = approach2(octal);
        System.out.println(result1);
        System.out.println(result2);
        scan.close();
    }
}
