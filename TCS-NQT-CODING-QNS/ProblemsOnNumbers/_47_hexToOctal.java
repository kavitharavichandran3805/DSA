import java.util.Scanner;

//hex -> deciaml -> octal
public class _47_hexToOctal {
    public static String approach1(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        return Integer.toOctalString(decimal);
    }

    public static String approach2(String hex) {
        int decimal = hexToDecimal(hex);
        return decimalToOctal(decimal);
    }

    public static String decimalToOctal(int decimal) {
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 8);
            decimal /= 8;
        }
        return sb.reverse().toString();
    }

    public static int hexToDecimal(String hex) {
        String hexChars = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int sum = 0;
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(hex.length() - i - 1);
            int val = hexChars.indexOf(ch);
            sum += (int) Math.pow(16, i) * val;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hex = scan.nextLine();
        String result1 = approach1(hex);
        String result2 = approach2(hex);
        System.out.println(result1);
        System.out.println(result2);
        scan.close();
    }
}
