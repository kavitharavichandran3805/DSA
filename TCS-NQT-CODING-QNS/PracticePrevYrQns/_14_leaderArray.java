import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.Arrays;

public class _14_leaderArray {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        int rightMax = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > rightMax) {
                rightMax = a[i];
            } else {
                a[i] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != -1) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
