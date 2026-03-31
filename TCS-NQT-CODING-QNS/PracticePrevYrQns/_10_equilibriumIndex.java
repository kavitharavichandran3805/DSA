import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10_equilibriumIndex {

    public static int getIndex(int[] a, int n) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        int lsum = 0, rsum = sum;
        for (int i = 0; i < n; i++) {
            rsum -= a[i];
            if (rsum == lsum) {
                return i;
            }
            lsum += a[i];
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        System.out.println(getIndex(a, n));
    }
}
