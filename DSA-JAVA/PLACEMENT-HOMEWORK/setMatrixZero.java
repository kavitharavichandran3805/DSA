import java.util.*;

public class setMatrixZero {
    public static void setZeroes(int[][] matrix) {
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        int[] arr1 = new int[row_len];
        int[] arr2 = new int[col_len];
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len; j++) {
                if (matrix[i][j] == 0) {
                    arr1[i] = 1;
                    arr2[j] = 1;

                }
            }
        }
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len; j++) {
                if (arr1[i] == 1 || arr2[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        System.out.println(Arrays.deepToString(a));

        setZeroes(a);
        System.out.println(Arrays.deepToString(a));
    }
}
