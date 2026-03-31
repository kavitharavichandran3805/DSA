import java.util.*;

public class _36_binaryToDecimal {

    public static int approach1(int b) {
        String binary = Integer.toString(b);
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }

    public static int approach2(int b) {
        int exp = 0, sum = 0;
        while (b > 0) {
            int rem = b % 10;
            sum += ((int) Math.pow(2, exp) * rem);
            exp += 1;
            b /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int result1 = approach1(b);
        int result2 = approach2(b);
        System.out.println(result1);
        System.out.println(result2);
        scan.close();
    }
}
