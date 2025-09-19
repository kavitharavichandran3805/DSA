public class neg_num_matrix {
    public static void main(String[] args) {
        int grid[][] = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 } };

        int ct = 0;
        int r = 0;
        int c = grid[0].length - 1;
        int len = grid.length;
        while (r < grid.length && c >= 0) {
            if (grid[r][c] < 0) {
                ct += len;
                --c;
                ++r;
                --len;
            } else if (grid[r][c] > 0) {
                ++r;
                --len;
            } else {
                ++r;
                --len;
            }

        }
        System.out.println(ct);
    }
}
