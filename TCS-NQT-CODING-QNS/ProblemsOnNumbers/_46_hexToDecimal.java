import java.util.Scanner;

public class _46_hexToDecimal {
    public static int approach1(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        return decimal;
    }

    public static int approach2(String hex) {
        int decimal = hexToDecimal(hex);
        return decimal;
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
        int result1 = approach1(hex);
        int result2 = approach2(hex);
        System.out.println(result1);
        System.out.println(result2);
        scan.close();
    }
}
