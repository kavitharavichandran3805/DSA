import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class diagonalTraverse {

    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        for (int d = 0; d < m + n - 1; d++) {
            int r = d < n ? 0 : d - n + 1;
            int c = d < n ? d : n - 1;
            ArrayList<Integer> a = new ArrayList<>();
            while (r < m && c >= 0) {
                a.add(mat[r][c]);
                ++r;
                --c;
            }
            if (d % 2 == 0) {
                Collections.reverse(a);
            }
            for (int ele : a) {
                result[index++] = ele;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(Arrays.toString(findDiagonalOrder(a)));
    }
}
