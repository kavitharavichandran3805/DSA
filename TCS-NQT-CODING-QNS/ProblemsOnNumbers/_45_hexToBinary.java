import java.util.*;

public class _45_hexToBinary {
    public static String approach1(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        return Integer.toBinaryString(decimal);
    }

    public static String approach2(String hex) {
        int decimal = hexToDecimal(hex);
        return decimalToBinary(decimal);
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 2);
            decimal /= 2;
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
