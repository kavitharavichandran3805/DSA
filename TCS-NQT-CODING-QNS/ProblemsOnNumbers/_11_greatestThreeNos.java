import java.util.*;

public class _11_greatestThreeNos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        System.out.println(Math.max(n1, Math.max(n2, n3)));
        scan.close();
    }
}
