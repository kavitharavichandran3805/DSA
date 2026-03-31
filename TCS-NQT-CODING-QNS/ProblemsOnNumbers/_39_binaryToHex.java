import java.util.Scanner;

public class _39_binaryToHex {
    public static String approach1(int b) {
        int decimal = Integer.parseInt(Integer.toString(b), 2);
        String hex = Integer.toHexString(decimal).toUpperCase();
        return hex;
    }

    public static String approach2(int b) {
        int decimal = Integer.parseInt(Integer.toString(b), 2);
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
        int b = scan.nextInt();
        String result1 = approach1(b);
        String result2 = approach2(b);
        System.out.println(result1);
        System.out.println(result2);
        scan.close();
    }
}
