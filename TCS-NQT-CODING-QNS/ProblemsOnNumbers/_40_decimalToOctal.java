import java.util.Scanner;

public class _40_decimalToOctal {
    public static int approach1(int decimal) {
        String octal = Integer.toOctalString(decimal);
        return Integer.parseInt(octal);
    }

    public static int approach2(int decimal) {
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 8);
            decimal = decimal / 8;
        }
        return Integer.valueOf(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int result1 = approach1(d);
        int result2 = approach2(d);
        System.out.println(result1);
        System.out.println(result2);
        scan.close();
    }
}
