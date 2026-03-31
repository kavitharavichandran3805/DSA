import java.util.Scanner;

//binary -> decimal -> octal
public class _38_binaryToOctal {
    public static int approach1(int b) {
        int decimal = Integer.parseInt(Integer.toString(b), 2);
        String octal = Integer.toOctalString(decimal);
        return Integer.parseInt(octal);
    }

    public static int approach2(int b) {
        int decimal = Integer.parseInt(Integer.toString(b), 2);
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 8);
            decimal = decimal / 8;
        }
        return Integer.valueOf(sb.reverse().toString());
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
