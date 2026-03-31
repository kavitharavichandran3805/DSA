import java.util.*;

//we have to find the number of elements which are greater than all the previous elements
public class _1_maxPrevious {

    public static int getCount(int[] a, int n) {
        if (a.length == 0) {
            return 0;
        }
        int ct = 1, max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                ++ct;
            }
        }
        return ct;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(getCount(a, n));
        scan.close();
    }
}