import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int rs = 0, re = matrix.length - 1;
        int cs = 0, ce = matrix[0].length - 1;

        while (rs <= re && cs <= ce) {
            for (int i = cs; i <= ce; i++) {
                l.add(matrix[rs][i]);
            }
            rs++;
            for (int i = rs; i <= re; i++) {
                l.add(matrix[i][ce]);
            }
            ce--;
            if (rs <= re) {
                for (int i = ce; i >= cs; i--) {
                    l.add(matrix[re][i]);
                }
                re--;
            }

            if (cs <= ce) {
                for (int i = re; i >= rs; i--) {
                    l.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(spiralOrder(a));
    }
}
