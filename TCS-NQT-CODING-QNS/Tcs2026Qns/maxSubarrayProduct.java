import java.util.*;

public class maxSubarrayProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int prefix = 1, suffix = 1, maxProduct = Integer.MIN_VALUE;
        int i = 0, j = a.length - 1;
        while (i < a.length && j >= 0) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }
            prefix *= a[i];
            suffix *= a[j];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
            i++;
            --j;
        }
        System.out.println(maxProduct);
        scan.close();
    }
}
