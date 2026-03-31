import java.util.*;

// sum(l to r) = sum(1 to r) - sum(1 to l-1)
public class _28_sumWithinRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        l = l - 1;
        int rightsum = (r * (r + 1)) / 2;
        int leftsum = (l * (l + 1)) / 2;
        System.out.println(rightsum - leftsum);
        scan.close();
    }
}
