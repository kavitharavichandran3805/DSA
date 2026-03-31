import java.util.Scanner;

// octal -> decimal -> hex
public class _44_octalToHex {
    public static String approach1(int octal) {
        int decimal = Integer.parseInt(Integer.toString(octal), 8);
        return Integer.toHexString(decimal);
    }

    public static String approach2(int o) {
        int decimal = octalToDecimal(o);
        return decimalToHex(decimal);

    }

    public static String decimalToHex(int decimal) {
        StringBuilder sb = new StringBuilder();
        String hexChars = "0123456789ABCDEF";
        while (decimal > 0) {
            sb.append(hexChars.charAt(decimal % 16));
            decimal = decimal / 16;
        }
        return sb.reverse().toString();
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int octal = scan.nextInt();
        String result1 = approach1(octal);
        String result2 = approach2(octal);
        System.out.println(result1);
        System.out.println(result2);
        scan.close();
    }
}
