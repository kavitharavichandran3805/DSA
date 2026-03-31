import java.util.*;

//octal -> decimal -> binary
public class _42_octalToBinary {

    public static int approach1(int octal) {
        int decimal = Integer.parseInt(Integer.toString(octal), 8);
        return Integer.parseInt(Integer.toBinaryString(decimal));
    }

    public static int approach2(int octal) {
        int decimal = octalToDecimal(octal);
        return decimalToBinary(decimal);

    }

    public static int octalToDecimal(int o) {
        int exp = 0, sum = 0;
        while (o > 0) {
            int rem = o % 10;
            sum += (int) Math.pow(8, exp) * rem;
            ++exp;
            o /= 10;
        }
        return sum;
    }

    public static int decimalToBinary(int d) {
        StringBuilder sb = new StringBuilder();
        while (d > 0) {
            sb.append(d % 2);
            d = d / 2;
        }
        return Integer.parseInt(sb.reverse().toString());
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
