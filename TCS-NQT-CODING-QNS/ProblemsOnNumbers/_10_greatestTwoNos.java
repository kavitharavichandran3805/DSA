import java.util.*;

public class _10_greatestTwoNos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        int second = scan.nextInt();
        System.out.println(Math.max(one, second));
        scan.close();
    }
}
