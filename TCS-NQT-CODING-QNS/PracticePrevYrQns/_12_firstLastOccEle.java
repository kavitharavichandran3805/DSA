import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _12_firstLastOccEle {

    public static int[] getIndex(int[] a, int n, int t) {
        int[] result = new int[2];
        result[0] = binary_search(a, n, t, true);
        result[1] = binary_search(a, n, t, false);

        return result;
    }

    public static int binary_search(int[] a, int n, int t, boolean firstIndex) {
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == t) {
                ans = mid;
                if (firstIndex) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (a[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        int t = Integer.parseInt(bf.readLine());
        System.out.println(Arrays.toString(getIndex(a, n, t)));
    }
}
