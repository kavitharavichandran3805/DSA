import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _11_transposeMatrix {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(bf.readLine());
            }
        }
        System.out.println(Arrays.deepToString(a));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

    }
}
