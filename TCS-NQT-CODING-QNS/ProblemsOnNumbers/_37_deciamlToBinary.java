import java.util.Scanner;

public class _37_deciamlToBinary {
    public static int approach1(int d) {
        String binary = Integer.toBinaryString(d);
        return Integer.parseInt(binary);
    }

    public static int approach2(int d) {

        StringBuilder sb = new StringBuilder();
        while (d > 0) {
            sb.append(d % 2);
            d = d / 2;
        }
        return Integer.parseInt(sb.reverse().toString());
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
