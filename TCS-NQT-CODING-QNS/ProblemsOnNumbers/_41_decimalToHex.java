import java.util.Scanner;

public class _41_decimalToHex {
    public static String approach1(int decimal) {
        String hex = Integer.toHexString(decimal).toUpperCase();
        return hex;
    }

    public static String approach2(int decimal) {
        StringBuilder sb = new StringBuilder();
        String hexChars = "0123456789ABCDEF";
        while (decimal > 0) {
            sb.append(hexChars.charAt(decimal % 16));
            decimal = decimal / 16;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        String result1 = approach1(d);
        String result2 = approach2(d);
        System.out.println(result1);
        System.out.println(result2);
        scan.close();
    }
}
